/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;



import org.hibernate.validator.constraints.NotBlank;



public class AuditInfo  {
    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * Order编号.
     */
    @NotBlank
    private String applyNo;
    /**
     * 用户确认状态.
     */
    private Integer userConfirmStatus=0;
    /**
     * 审核状态.
     */
     private Integer auditStatus=0;
    /**
     * 审核金额.
     */
    private Long auditAmount;
    /**
     * 审核状态说明.
     */
    private String auditStatusExplain;
    /**
     * 审核时间.
     */
    private String auditTime;
    /**
     * 手续费率.
     */
    private Integer handleRate;
    /**
     * 手续费用.
     */
    private Long handleAmount;

    /**
     * 是否可以Going. 1:可以Going， 0： 不可Going.
     */
    private Integer approveCharge;

    /**
     * 操作允许Going的时间戳.
     */
    private Long approveChargeTime;

    /**
     * risk系统的审核状态.
     */
    private String fkAuditStatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public Integer getUserConfirmStatus() {
        return userConfirmStatus;
    }

    public void setUserConfirmStatus(Integer userConfirmStatus) {
        this.userConfirmStatus = userConfirmStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getAuditAmount() {
        return auditAmount;
    }

    public void setAuditAmount(Long auditAmount) {
        this.auditAmount = auditAmount;
    }

    public String getAuditStatusExplain() {
        return auditStatusExplain;
    }

    public void setAuditStatusExplain(String auditStatusExplain) {
        this.auditStatusExplain = auditStatusExplain;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getHandleRate() {
        return handleRate;
    }

    public void setHandleRate(Integer handleRate) {
        this.handleRate = handleRate;
    }

    public Long getHandleAmount() {
        return handleAmount;
    }

    public void setHandleAmount(Long handleAmount) {
        this.handleAmount = handleAmount;
    }

    public Integer getApproveCharge() {
        return approveCharge;
    }

    public void setApproveCharge(Integer approveCharge) {
        this.approveCharge = approveCharge;
    }

    public Long getApproveChargeTime() {
        return approveChargeTime;
    }

    public void setApproveChargeTime(Long approveChargeTime) {
        this.approveChargeTime = approveChargeTime;
    }

    public String getFkAuditStatus() {
        return fkAuditStatus;
    }

    public void setFkAuditStatus(String fkAuditStatus) {
        this.fkAuditStatus = fkAuditStatus;
    }
}
