/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.fk;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;


public class FkOrderEsbLog implements Serializable {

    /**
     * Mongo id.
     */

    private String id;

    /**
     * 返回信息代码.
     */
    private String returnCode;

    /**
     * 系统代码.
     */
    private String systemCode;

    /**
     * 返回信息文本.
     */
    private String returnMsg;

    /**
     * 消息类型.
     */
    private String msgType;

    private String requestType;

    /**
     * 请求ID.
     */
   private String requestId;

    /**
     * riskID.
     */
    private String loanId;

    /**
     * 创建时间.
     */
    private String createTime;

    /**
     * 批贷金额.
     */
    private String approvalAmount;

    /**
     * 批贷金额单位.
     */
    private String approvalTerm;

    /**
     * flush周期单位.
     */
    private String borrowPeriodUnit;

    /**
     * 审核状态.
     */
    private String bizStatus;

    /**
     * 反馈内容.
     */
    private String feedBack;

    /**
     * flush期限
     */
    private Integer term;

    /**
     * Getting方式
     */
    private Integer repayMode;

    /**
     * trade类型
     */
    private Integer tradeType;

    /**
     * 可用amount（剩余amount）.
     */
    private Long availableQuota;

    /**
     * createamount.
     */
    private Long creditQuota;

    /**
     * amount开始时间.
     */
    private String creditTime;

    /**
     * amount结束时间.
     */
    private String failureTime;

    /**
     * 审核结果描述.
     * bs字典（riskReturnReason）.
     */
    private Integer riskReturnReason;

    /**
     * trade金额.
     */
    private Long tradeQuota;

    /**
     * 畅游trade产品类型
     */
    private Integer productType;

    /**
     * Esb消息JSon串.
     */
    @JSONField(serialize = false)
    private String json;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(String approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public String getApprovalTerm() {
        return approvalTerm;
    }

    public void setApprovalTerm(String approvalTerm) {
        this.approvalTerm = approvalTerm;
    }

    public String getBorrowPeriodUnit() {
        return borrowPeriodUnit;
    }

    public void setBorrowPeriodUnit(String borrowPeriodUnit) {
        this.borrowPeriodUnit = borrowPeriodUnit;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getRepayMode() {
        return repayMode;
    }

    public void setRepayMode(Integer repayMode) {
        this.repayMode = repayMode;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Long getAvailableQuota() {
        return availableQuota;
    }

    public void setAvailableQuota(Long availableQuota) {
        this.availableQuota = availableQuota;
    }

    public Long getCreditQuota() {
        return creditQuota;
    }

    public void setCreditQuota(Long creditQuota) {
        this.creditQuota = creditQuota;
    }

    public String getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(String creditTime) {
        this.creditTime = creditTime;
    }

    public String getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(String failureTime) {
        this.failureTime = failureTime;
    }

    public Integer getRiskReturnReason() {
        return riskReturnReason;
    }

    public void setRiskReturnReason(Integer riskReturnReason) {
        this.riskReturnReason = riskReturnReason;
    }

    public Long getTradeQuota() {
        return tradeQuota;
    }

    public void setTradeQuota(Long tradeQuota) {
        this.tradeQuota = tradeQuota;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
