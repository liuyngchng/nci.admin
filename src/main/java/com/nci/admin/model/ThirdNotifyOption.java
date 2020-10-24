/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model;

import java.io.Serializable;


public class ThirdNotifyOption implements Serializable {

    private static final long serialVersionUID = 1920716068747031705L;

    /**
     * 主键.
     */
    private long id;

    /**
     * order编号.
     */
    private String applyNo;

    /**
     * riskId.
     */
    private String loanId;

    /**
     * Loan type.
     */
    private int loanType;

    /**
     * Bid channel.
     */
    private int bidChannel;

    /**
     * 第三方订单Id.
     */
    private String partnerId;


    /**
     * 页码.
     */
    private int page;

    /**
     * 每页记录数.
     */
    private int size = 20;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public int getLoanType() {
        return loanType;
    }

    public void setLoanType(int loanType) {
        this.loanType = loanType;
    }

    public int getBidChannel() {
        return bidChannel;
    }

    public void setBidChannel(int bidChannel) {
        this.bidChannel = bidChannel;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
