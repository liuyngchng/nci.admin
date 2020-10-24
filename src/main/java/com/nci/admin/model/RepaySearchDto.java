package com.nci.admin.model;


public class RepaySearchDto  {

    /**
     * 用户id.
     */
    private String uid;

    /**
     * riskid.
     */
    private String lid;

    /**
     * 需查询第几期.
     */
    private String rtm;

    /**
     * 页码，从1开始.
     */
    private int pageNo;

    /**
     * 每页大小
     */
    private int pageSize;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getRtm() {
        return rtm;
    }

    public void setRtm(String rtm) {
        this.rtm = rtm;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
