/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

/**
 * Getting方式.
 * @author Each Zhang
 * @version $Id$
 * @since 2016.11.16
 */
public enum CwCollection {


    DEBX(1, "debx"),
;


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
    CwCollection(final Integer cod, final String nam) {
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
