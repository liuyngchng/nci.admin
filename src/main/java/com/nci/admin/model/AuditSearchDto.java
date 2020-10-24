package com.nci.admin.model;

public class AuditSearchDto {

    /**
     * Constructor
     * @param applyNo
     */
    public AuditSearchDto(final String applyNo) {
        this.applyNo = applyNo;
    }

    /**
     * 开始时间.
     */
    private String startTime;

    /**
     * 结束时间.
     */
    private String endTime;

    /**
     * order编号.
     */
    private String applyNo;

    /**
     * 页码，从1开始.
     */
    private String pageNo;

    /**
     * 审核状态
     */
    private String auditStatus;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
