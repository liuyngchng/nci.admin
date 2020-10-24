/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


/**
 * 联系人关系.
 * Author: Li gang
 * Date: 16/12/1
 * Time: 下午3:30
 */
public enum RelationShip {

    BJ("1","父母"),
    TJ("2","兄弟姐妹"),
    HEB("3","配偶"),
    SHANX("4","其它");


    private String code;

    private String name;

    RelationShip(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode(String code) {

        return "";
    }
}
