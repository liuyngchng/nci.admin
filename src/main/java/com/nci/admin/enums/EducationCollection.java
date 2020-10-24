/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;

/**
 * 学历.
 * Created by Each.Zhang on 16/11/17.
 * @author Richard Liu (liuyongcheng@test.com)
 * @since 2016.11.17
 */
public enum EducationCollection {

    /**
     * Middle school.
     */
    CZJYX(1, "初中及以下"),

    /**
     * High school.
     */
    GZHONG(2, "高中"),

    /**
     * College.
     */
    ZZ(3, "中专"),

    /**
     * College.
     */
    DZ(4, "大专"),

    /**
     * College.
     */
    GZHI(5, "高职"),

    /**
     * Bachelor.
     */
    BK(6, "本科"),

    /**
     * Master.
     */
    SS(7, "硕士"),

    /**
     * Doctor and above.
     */
    BSJYS(8, "博士及以上");


    /**
     * 教育程度code.
     */

    private Integer code;

    /**
     * 教育程度name。
     */
    private String name;

    /**
     * Constructor.
     * @param cod Education code
     * @param nam Education name
     */
    EducationCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * 通过名称查询代码.
     * @param cod Education cod
     * @return 教育程度名称
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
