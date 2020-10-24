/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;

import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * Created by LCW on 16/6/13.
 * Mongo collection loanApplyInfo.
 *
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.06.13
 */

public class LoanApplyInfo  {
    private static final long serialVersionUID = 1L;

    /**
     * Mongo collection 主键.
     */

    private String id;
    /**
     * 冗余UID.
     */
    @NotNull

    private Long uid;
    /**
     * Order编号.
     */
    @NotBlank
    @Length(max = 20)

    private String applyNo;
    /**
     * 业务编码.
     * 薪易贷业务编码:10000001.
     */
    @NotBlank

    private String productCode;
    /**
     * risk系统order编号.
     */

    private String fkLoanNo;
    /**
     * 第三方申请编号.
     */

    private String partnerApplyNo;
    /**
     * 产品类型.
     */

    private Integer loanType;
    /**
     * Getting方式.
     */
    private Integer repayMode;
    /**
     * 申请时间.
     * yyyyMMddHHmmss.
     */

    private String applyTime;
    /**
     * 申请金额.
     */
    private Long applyAmount;
    /**
     * 申请flush期限.
     */
    private Integer term;
    /**
     * flush期限单位.
     */
    private Integer termUnit;
    /**
     * Getting日期.
     * yyyyMMddHHmmss.
     */
    private String repayDate;
    /**
     * SUCchannel.
     */
    private String sucCode;
    /**
     * 对应标ID.
     */
    private Long bidId;
    /**
     * 标channel标识.
     */

    private String bidChannel;
    /**
     * 首次创建时间.
     * yyyyMMddHHmmss.
     */
    private String createTime;
    /**
     * trade类型.
     * BS字典值 tradeType.
     */
    private Integer tradeType;

    /**
     * 小二CFCA状态.
     */
    private Integer cfcaStatus;

    /**
     * OP状态.
     */
    private String opCfcaStatus;

    /**
     * 设备信息.
     */
    private String deviceInfo;

    /**
     * 是否已推送了ESB消息给risk, true：已推送， false：未推送.
     */
    private Boolean esbMsgPushFlag;

    /**
     * 聚信立Token，这个token来自大数据，后期感觉需要优化，暂时放在这个位置.
     */
    private String jxlToken;

    /**
     * 用户操作是否被锁定.
     */
    private Boolean userOperationLock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getFkLoanNo() {
        return fkLoanNo;
    }

    public void setFkLoanNo(String fkLoanNo) {
        this.fkLoanNo = fkLoanNo;
    }

    public String getPartnerApplyNo() {
        return partnerApplyNo;
    }

    public void setPartnerApplyNo(String partnerApplyNo) {
        this.partnerApplyNo = partnerApplyNo;
    }

    public Integer getLoanType() {
        return loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getRepayMode() {
        return repayMode;
    }

    public void setRepayMode(Integer repayMode) {
        this.repayMode = repayMode;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public Long getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Long applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getTermUnit() {
        return termUnit;
    }

    public void setTermUnit(Integer termUnit) {
        this.termUnit = termUnit;
    }

    public String getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate;
    }

    public String getSucCode() {
        return sucCode;
    }

    public void setSucCode(String sucCode) {
        this.sucCode = sucCode;
    }

    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
    }

    public String getBidChannel() {
        return bidChannel;
    }

    public void setBidChannel(String bidChannel) {
        this.bidChannel = bidChannel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getCfcaStatus() {
        return cfcaStatus;
    }

    public void setCfcaStatus(Integer cfcaStatus) {
        this.cfcaStatus = cfcaStatus;
    }

    public String getOpCfcaStatus() {
        return opCfcaStatus;
    }

    public void setOpCfcaStatus(String opCfcaStatus) {
        this.opCfcaStatus = opCfcaStatus;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public Boolean getEsbMsgPushFlag() {
        return esbMsgPushFlag;
    }

    public void setEsbMsgPushFlag(Boolean esbMsgPushFlag) {
        this.esbMsgPushFlag = esbMsgPushFlag;
    }

    public String getJxlToken() {
        return jxlToken;
    }

    public void setJxlToken(String jxlToken) {
        this.jxlToken = jxlToken;
    }

    public Boolean getUserOperationLock() {
        return userOperationLock;
    }

    public void setUserOperationLock(Boolean userOperationLock) {
        this.userOperationLock = userOperationLock;
    }
}
