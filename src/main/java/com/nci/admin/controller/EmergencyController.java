/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.enums.AuditStatus;
import com.nci.admin.enums.Permission;
import com.nci.admin.model.base.AuditInfo;
import com.nci.admin.model.base.LoanApplyInfo;
import com.nci.admin.service.IndexService;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.MessageFormat;

/**
 * 异常处理.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.01.16
 */
@UserLogger
@Controller
@RequestMapping("emergency")
public final class EmergencyController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(EmergencyController.class);

    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "xiaoer.emergency";

    /**
     * 检索条件公共服务.
     */
    @Autowired
    private IndexService indexService;

    /**
     * pay主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("pay/index")
    public String payIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "emergency/payIndex",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * pay主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("unbind/bank/index")
    public String unbindBankIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "emergency/unbindBankIndex",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 更新pay状态.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @ResponseBody
    @RequestMapping(value = "unbind/bank", method = RequestMethod.POST)
    public String unbindBank(final HttpServletRequest request) {
        final Long bankCardId;
        try {
            bankCardId = Long.parseLong(request.getParameter("bankCardId"));
        } catch (final NumberFormatException ex) {
            LOGGER.error("NumberFormatException", ex);
            return "bankCardId必须为数字";
        }

        final String payChannel = request.getParameter("payChannel");
        LOGGER.info(
            "unbind bank, bankCardId {}, payChannel {}",
            bankCardId,
            payChannel
        );
        String result = null;
        if (null == payChannel) {
            LOGGER.error("pay channel is null");
        } else if ("1".equals(payChannel)) {
            LOGGER.info("baoFooPayService.unbind({})", bankCardId);
            result = "";
        } else if ("2".equals(payChannel)) {
            LOGGER.info("baoLiPayService.unbind({})", bankCardId);
            result = "";
        }
        LOGGER.info("update pay status result: {}", result);
        return result;
    }

    /**
     * 更新pay状态.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @ResponseBody
    @RequestMapping(value = "pay", method = RequestMethod.POST)
    public String updateRepayStatus(final HttpServletRequest request) {
        final String payOrderNo = request.getParameter("payNo");
        final String payChannel = request.getParameter("payChannel");
        LOGGER.info(
            "update pay status, payNo {}, payChannel {}",
            payOrderNo,
            payChannel
        );
        String result = null;
        if (null == payChannel) {
            LOGGER.error("pay channel is null");
        } else if ("1".equals(payChannel)) {
            result = "";
        } else if ("2".equals(payChannel)) {
            result = "";
        }
        LOGGER.info("update pay status result: {}", result);
        return result;
    }

    /**
     * 更新审核状态静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A String result.
     */
    @RequestMapping("auditStatus/index")
    public String updateAuditStatusIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "emergency/auditStatusIndex",
            Permission.XHJR_IMPORT_UPDAT.getKey()
        );
    }

    /**
     * 提交更新审核状态.
     * @param applyNo order编号.

     * @return 更新结果.
     */
    @ResponseBody
    @RequestMapping(value = "auditStatus/update", method = RequestMethod.POST)
    public String updateAuditStatus(final String applyNo,
        final Integer auditStatus) {

        String result;
        if (null == applyNo || null == auditStatus) {
            result = "applyNo or auditStatus is null";
        } else if (null == AuditStatus.getAuditStatus(auditStatus)) {
            result = "illegal auditStatus";
        } else {
            LoanApplyInfo applyInfo = null;
            if (null == applyInfo) {
                result = "loanApplyInfo can't be found by applyNo.";
            } else {
                final AuditInfo auditInfo = null;
                if (null == auditInfo) {
                    result = "update failed.";
                } else {
                    result = "update successfully!";
                }
            }
        }
        return result;
    }

    /**
     * 解除redis锁主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("release/key/index")
    public String releaseKeyIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "emergency/releaseKeyIndex",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 解除redis锁.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @ResponseBody
    @RequestMapping(value = "release/key", method = RequestMethod.POST)
    public boolean releaseKey(final HttpServletRequest request) {
        final String redisKey = request.getParameter("redisKey");
        if (null == redisKey || "" == redisKey) {
            LOGGER.info("redisKey is null.");
            return false;
        } else {
            return this.releaseLock(
                MessageFormat.format(
                    "xhjr:huihua:user:loan:{0}",
                    redisKey.trim()
                )
            );
        }
    }


    private boolean releaseLock(final String redisKey) {
        return true;
    }
}
