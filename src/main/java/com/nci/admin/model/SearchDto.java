/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model;

import com.alibaba.dubbo.common.json.JSON;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;


/**
 * 查询dto
 * Created by Each.Zhang on 16/11/18.
 */

public class SearchDto implements Serializable {
    private static final long serialVersionUID = 8457557576875333763L;
    /**
     * 产品类型.
     */
    private String loanType;

    /**
     * 产品channel.
     */
    private String bidChannel;

    /**
     * 申请时间-开始.
     */
    private String applyBegin;

    /**
     * 申请时间-结束.
     */
    private String applyEnd;

    /**
     * create状态.
     */
    private String auditStatus;

    /**
     * order状态.
     */
    private String importStatus;

    /**
     * whoor手机号.
     */
    private String idOrMobile;

    /**
     * riskid.
     */
    private String fkLoanNo;

    /**
     * 订单id.
     */
    private String applyNo;

    /**
     * 第三方订单id.
     */
    private String partnerApplyNo;

    /**
     * 页码.
     */
    private Integer pageNo;

    /**
     * 每页数量.
     */
    private Integer pageSize;

    /**
     * trade类型.
     */
    private String tradeType;

    /**
     * 审核结果.
     */
    private String riskReturnReason;

    /**
     * 业务类型编码.
     */
    private String businessNum;

    /**
     * 订单状态.
     */
    private String bizStatus;

    /**
     * channelorder编号.
     */
    private String partnerNo;

    /**
     * 是否允许Going，1：允许，0：不允许.
     */
    private String approveCharge;

    /**
     * 允许Going时间.
     */
    private String approveTimeBegin;

    /**
     * 允许Going时间.
     */
    private String approveTimeEnd;

    /**
     * 第三方订单ID列表.
     */
    private List<String> thirdOrderIdList;

    @Override
    public String toString() {

        try {
            return JSON.json(this);
        } catch (IOException e) {
            return "";
        }
    }
}
