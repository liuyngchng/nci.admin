/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


/**
 * 时间单位.
 * Created by Each.Zhang on 16/11/17.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 20
 */
public enum TermUnitCollection {

    /**
     * Month.
     */
    YUE(1, "月"),

    /**
     * Day.
     */
    RI(2, "日"),

    /**
     * Year.
     */
    NIAN(3, "年");


    private Integer code;

    private String name;

    /**
     * Constructor.
     * @param cod Time unit cod
     * @param nam Time unit nam
     */
    TermUnitCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * 通过Code获取name.
     * @param cod Time unit code
     * @return Time unit name
     */
    public static String getNameByCode(final Integer cod) {

        return "";
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
