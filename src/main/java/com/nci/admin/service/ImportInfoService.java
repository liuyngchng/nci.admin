/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

import com.nci.admin.model.ApplySearchDto;
import com.nci.admin.model.AuditSearchDto;
import com.nci.admin.model.LoanVo;
import com.nci.admin.model.base.AuditInfo;
import com.nci.admin.model.Pagination;
import com.nci.admin.model.base.LoanApplyInfo;

import java.util.List;


/**
 * sky信息查询服务.
 */
public interface ImportInfoService {

    /**
     * 获取用户的order数据.
     * @param applySearchDto A {@link ApplySearchDto} instance.
     * @return A {@link LoanVo} list
     */
    Pagination<LoanVo> getLoanInfo(ApplySearchDto applySearchDto);

    /**
     * 获取用户的所有order数据(不分页).
     * @param applySearchDto A {@link ApplySearchDto} instance.
     * @return A {@link LoanApplyInfo} list
     */
    List<LoanApplyInfo> getAllLoanInfo(ApplySearchDto applySearchDto);

    /**
     * 获取审核信息.
     * @param auditSearchDto A {@link AuditSearchDto} instance
     * @return A {@link LoanVo} list
     */
    Pagination<AuditInfo> getAuditInfo(AuditSearchDto auditSearchDto);

    /**
     * 获取审核信息(不分页).
     * @param auditSearchDto A {@link AuditSearchDto} instance
     * @return A {@link AuditInfo} list
     */
    List<AuditInfo> getAllAuditInfo(AuditSearchDto auditSearchDto);

    /**
     * 获取重发数量.
     * @param auditSearchDto A {@link AuditSearchDto} instance.
     * @return A number.
     */
    long getAllAuditInfoTotal(AuditSearchDto auditSearchDto);
}
