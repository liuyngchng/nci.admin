/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model;

import com.alibaba.dubbo.common.json.JSON;
import org.apache.commons.lang.time.DateFormatUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * .
 * @author Peng Chuanjiang (pengchuanjiang@test.com)
 * @version $Id$
 * @since 2017.02.16
 */
public final class ThirdNotifyItem implements Serializable {

    private static final long serialVersionUID = -1530224561333420383L;

    /**
     * 数据库Id.
     */
    private long id;

    /**
     * order编号.
     */
    private String applyNo;

    /**
     * riskID.
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
     * 第三方订单ID.
     */
    private String partnerId;

    /**
     * 参数.
     */
    private transient Map<String, String> params;

    /**
     * 状态.
     */
    private int status;

    /**
     * 创建时间.
     */
    private Date createTime;

    /**
     * 更新时间.
     */
    private Date updateTime;

    /**
     * Getter.
     * @return Update time.
     */
    public String getUpdateTime() {
        return DateFormatUtils.format(this.updateTime, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * Getter.
     * @return Formatted create time.
     */
    public String getCreateTime() {
        return DateFormatUtils.format(this.createTime, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取参数.
     * @return A string result.
     */
    public String getContext() {
        try {
            return JSON.json(this.params);
        } catch (IOException e) {
            return "";
        }
    }

}
