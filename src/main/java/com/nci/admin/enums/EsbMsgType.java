/**
 * Copyright (c) 2014-2016, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;

/**
 * Esb消息类型.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.1.19
 */
public enum EsbMsgType {

    /**
     * create结果.
     */
    CREDIT_NOTICE("CREDIT_NOTICE", "create结果"),
    /**
     * trade结果.
     */
    TRADE_NOTICE("TRADE_NOTICE", "trade结果"),
    /**
     * trade.
     */
    LOAN_ID_TRADE("LOAN_ID_TRADE", "收到trade消息"),
    /**
     * create.
     */
    LOAN_ID_CREDIT("LOAN_ID_CREDIT", "收到create信息"),
    /**
     * Getting状态.
     */
    REPAY_STATUS("REPAY_STATUS", "Getting状态"),

    /**
     * order
     */
    LOAN_ID_RES("LOAN_ID_RES", "收到order信息"),

    /**
     * 补充what
     */
    ADD_INFO("ADD_INFO", "补充what"),

    /**
     * 审核结果.
     */
    REVIEW_RESULT("REVIEW_RESULT", "审核结果"),

    /**
     * 已结清.
     */
    REPAY_FINISHED("REPAY_FINISHED", "已结清"),

    /**
     * Getting存在expired.
     */
    REPAY_OVERDUE("REPAY_OVERDUE", "已结清"),

    /**
     * Getting计划生成、有变动.
     */
    PLAN_REVISE("PLAN_REVISE", "Getting计划变动"),

    /**
     * Going中.
     */
    LOAN_SUC("LOAN_SUC", "Going中");

    /**
     * Esb消息类型.
     */
    private String type;

    /**
     * 文字说明.
     */

    private String desc;

    /**
     * 构造函数.
     * @param type 消息类型.
     */
    EsbMsgType(final String type, final String desc) {
        this.type = type;
        this.desc = desc;
    }

    /**
     * 根据消息类型获取EsbMsgType枚举.
     * @param msgType 消息类型
     * @return A {@link EsbMsgType} enum
     */
    public static EsbMsgType getEsbMsgType(final String msgType) {

        EsbMsgType fkMsgType;

        return null;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
