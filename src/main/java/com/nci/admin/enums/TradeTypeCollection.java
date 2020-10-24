/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


/**
 * trade类型.
 * Created by Each.Zhang on 16/11/16.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.11.16
 */
public enum TradeTypeCollection {
    /**
     * 消费.
     */
    XF(1, "消费"),

    /**
     * 退款.
     */
    TK(2, "退款"),

    /**
     * Getting.
     */
    HK(3, "Getting");


    private Integer code;

    private String name;

    /**
     * Constructor.
     * @param cod trade类型代码
     * @param nam trade类型名称
     */
    TradeTypeCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * 通过代码获取名称.
     * @param code trade类型代码
     * @return trade类型名称
     */
    public static String getNameByCode(final Integer code) {

        return "";
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
