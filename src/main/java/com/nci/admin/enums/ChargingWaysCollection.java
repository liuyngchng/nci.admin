/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;

/**
 * Getting方式.
 * @author Each Zhang
 * @version $Id$
 * @since 2016.11.16
 */
public enum ChargingWaysCollection {

    /**
     * 等额本息.
     */
    DEBX(1, "等额本息"),

    /**
     * 先息后本.
     */
    XXHB(2, "先息后本"),

    /**
     * 一次结清.
     */
    YCJQ(3, "一次结清"),

    /**
     * 等本等息.
     */
    DBDX(4, "等本等息"),

    /**
     * 随时结清.
     */
    SSJQ(5, "随时结清"),

    /**
     * 一次付息.
     */
    YCFX(6, "一次付息"),

    /**
     * 先息后本息.
     */
    XXHBX(7, "先息后本息");


    /**
     * Getting方式code.
     */
    private Integer code;

    /**
     * Getting方式name.
     */

    private String name;


    /**
     * Constructor.
     * @param cod Getting方式code.
     * @param nam Getting方式name.
     */
    ChargingWaysCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * 通过Getting方式代码获取名称.
     * @param code Getting方式code
     * @return A String result
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
