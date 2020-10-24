package com.nci.admin.model;

/**
 * order信息查询条件.
 * @author Richard Liu(liuyongcheng@test.com)
 * @since 2017.08.21
 * @version $Id$
 */

public class ApplySearchDto {

    /**
     * Constructor
     * @param applyNo
     */
    public ApplySearchDto(final String applyNo) {
        this.applyNo = applyNo;
    }
    /**
     * User id
     */
    private String uid;

    /**
     * 开始时间.
     */
    private String startTime;

    /**
     * 结束时间.
     */
    private String endTime;

    /**
     * 产品代码.
     */
    private String productCode;

    /**
     * order编号.
     */
    private String applyNo;

    /**
     * 是否发送ESB.
     */
    private String esbMsgPushFlag;

    /**
     * 页码，从1开始.
     */
    private String pageNo;

    /**
     * 用户手机号码,使用手机号码查询可能存在问题，
     * 最好使用uid，用户更改过手机号时，uid是不变的
     */
    private String mobile;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getEsbMsgPushFlag() {
        return esbMsgPushFlag;
    }

    public void setEsbMsgPushFlag(String esbMsgPushFlag) {
        this.esbMsgPushFlag = esbMsgPushFlag;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
