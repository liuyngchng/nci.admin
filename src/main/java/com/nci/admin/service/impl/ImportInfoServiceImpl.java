package com.nci.admin.service.impl;

import com.alibaba.fastjson.JSONObject;

import com.nci.admin.model.ApplySearchDto;
import com.nci.admin.model.AuditSearchDto;
import com.nci.admin.model.LoanVo;
import com.nci.admin.model.base.AuditInfo;
import com.nci.admin.model.base.ContactsInfo;
import com.nci.admin.model.base.LoanApplyInfo;
import com.nci.admin.model.base.UserBankInfo;
import com.nci.admin.model.base.UserBaseInfo;
import com.nci.admin.model.base.UserWorkInfo;
import com.nci.admin.service.ImportInfoService;
import com.nci.admin.utils.HttpAgent;
import com.nci.admin.model.Pagination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public final class ImportInfoServiceImpl implements ImportInfoService {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(ImportInfoServiceImpl.class);

    private static final int INITIAL_CAPACITY = 8;

    /**
     * 每页数据条数.
     */
    private static final int PAGE_SIZE = 10;

    /**
     * 排序字段名称
     */
    private static final String SORT_FIELD = "_id";

    /**
     * 最小日期.
     */
    private static final String DATE_MIN = "00000000000000";

    /**
     * 最大日期.
     */
    private static final String DATE_MAX = "29999999999999";

    /**
     * risk查询订单状态的url.
     */
    private static final String FK_URL = "http://admin.test.com/risk/openrouter/findLoanStatus";
    private static final String APPLY_NO = "applyNo";


    @Override
    public Pagination<LoanVo> getLoanInfo(final ApplySearchDto search) {

        final Pagination page = new Pagination<>(1, 10, 0);
        final List<LoanVo> loanList = this.getLoanList(search);
        if (loanList.isEmpty() ) {
            page.setTotal(0);
        } else {
            page.setRows(loanList);

        }
        return page;
    }

    @Override
    public List<LoanApplyInfo> getAllLoanInfo(ApplySearchDto applySearchDto) {
        List<LoanApplyInfo> list =null;
        return list;
    }

    @Override
    public Pagination<AuditInfo> getAuditInfo(
        final AuditSearchDto auditSearchDto) {
        final Pagination page = new Pagination<>(1, 10, 0);
        final List<AuditInfo> loanList = this.getAuditInfoList(auditSearchDto);
        if (null == loanList || loanList.isEmpty() ) {
            page.setTotal(0);
        } else {
            page.setRows(loanList);

        }
        this.addFkAuditStatus(page);
        return page;
    }

    @Override
    public long getAllAuditInfoTotal(final AuditSearchDto auditSearchDto){
        return 0;
    }

    @Override
    public List<AuditInfo> getAllAuditInfo(
        final AuditSearchDto auditSearchDto) {
        List<AuditInfo> list = null;
        return list;
    }

    private void addFkAuditStatus(final Pagination page) {
        if (null == page || null == page.getRows() || page.getRows().isEmpty()) {
            return;
        }
        List<AuditInfo> auditInfoList = page.getRows();
        for (AuditInfo auditInfo : auditInfoList) {
            auditInfo.setFkAuditStatus(
                this.getFkAuditStatus(auditInfo.getApplyNo())
            );
        }
    }

    private String getFkAuditStatus(final String applyNo) {
        final Map<String, String> param = new HashMap<>();
        param.put("loanId", applyNo);
        String result = HttpAgent.sendPost(FK_URL, param);
        JSONObject json = JSONObject.parseObject(result);
        final String status;
        if (json.getInteger("error_code") == 0) {
            status = json.getString("data");
        } else {
            status = json.getString("error_msg");
        }
        return status;
    }

    /**
     * 获取用户的loanVo list.
     * @param applySearchDto A {@link ApplySearchDto} instance
     * @return A {@link LoanVo} list
     */

    private List<LoanVo> getLoanList(final ApplySearchDto applySearchDto) {
        List<LoanVo> loanVOList =
            new ArrayList<>(ImportInfoServiceImpl.INITIAL_CAPACITY);
        final List<LoanApplyInfo> applyInfoList =
        this.getDataList(applySearchDto, LoanApplyInfo.class);
        for (LoanApplyInfo applyInfo : applyInfoList) {
            final LoanVo loanVo = new LoanVo();
            loanVo.setLoanApplyInfo(applyInfo);
            if (null == applyInfo.getApplyNo()) {
                LOGGER.info("applyNo is null for {}", applyInfo.getId());
                continue;
            }
            final ApplySearchDto auditSearch =
                new ApplySearchDto(applyInfo.getApplyNo());
            auditSearch.setPageNo("1");
            final AuditInfo auditInfo =
                this.getInfo(auditSearch, AuditInfo.class);
            loanVo.setAuditInfo(auditInfo);
            Boolean isLock = applyInfo.getUserOperationLock();

            loanVOList.add(loanVo);
        }
        this.addOpCfcaStatus(applyInfoList);
        this.addOtherInfo(loanVOList);
        return loanVOList;
    }

    /**
     * 添加OP中的CFCA状态.
     * @param applyInfoList A {@link LoanApplyInfo} list
     */

    private List<LoanApplyInfo> addOpCfcaStatus(
        final List<LoanApplyInfo> applyInfoList) {

        return applyInfoList;
    }


    private static String getCfcaDesc(final String retCode) {
        final String desc = null;

        return desc;
    }


    private String getCfcaStatus(final String applyNo, final long uid) {

        return null;
    }


    private List<AuditInfo> getAuditInfoList(final AuditSearchDto auditSearchDto) {
        return this.getDataList(auditSearchDto, AuditInfo.class);
    }


    private void addOtherInfo(final List<LoanVo> loanVOList) {
        if (null == loanVOList || loanVOList.isEmpty() || loanVOList.size() > 1) {
            return;
        }
        final ApplySearchDto applySearchDto = new ApplySearchDto(
            loanVOList.get(0).getLoanApplyInfo().getApplyNo()
        );
        applySearchDto.setPageNo("1");
        loanVOList.get(0).setUserBaseInfo(
            this.getInfo(applySearchDto, UserBaseInfo.class)
        );
        loanVOList.get(0).setUserBankInfo(
            this.getInfo(applySearchDto, UserBankInfo.class)
        );
        loanVOList.get(0).setContactsInfo(
            this.getInfo(applySearchDto, ContactsInfo.class)
        );
        loanVOList.get(0).setUserWorkInfo(
            this.getInfo(applySearchDto, UserWorkInfo.class)
        );

    }


    private <T> T getInfo(final ApplySearchDto applySearchDto, final Class<T> clazz) {
        return null;
    }

    private <T> List<T> getDataList(final ApplySearchDto applySearchDto, final Class<T> clazz) {
        return null;
    }


    private <T> List<T> getDataList(final AuditSearchDto auditSearchDto,
        final Class<T> clazz) {
        return null;
    }


    private <T> List<T> find(final String query, Class<T> clazz, String collection) {
        return null;
    }

    private long count(final String query, final Class clazz) {
        return this.count(
            "",
            clazz,
            ""
        );
    }


    private long count(String query, Class<?> clazz, String collection) {
        return 0;
    }
}
