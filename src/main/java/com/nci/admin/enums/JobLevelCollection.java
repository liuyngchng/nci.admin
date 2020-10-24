/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


public enum JobLevelCollection {

    /**
     * 公务员-厅级及以上.
     */
    GWY_TJ(11, "公务员-厅级及以上"),

    /**
     * 公务员-局级.
     */
    GWY_JJ(12, "公务员-局级"),

    /**
     * 公务员-处级.
     */
    GWY_CJ(13, "公务员-处级"),

    /**
     * 公务员-科级.
     */
    GWY_KJ(14, "公务员-科级"),

    /**
     * 一般干部.
     */
    GWY_YB(15, "一般干部"),

    /**
     * 法人.
     */
    FGWY_FR(21, "法人"),

    /**
     * 股东.
     */
    FGWY_GD(22, "股东"),

    /**
     * 企业负责人.
     */
    FGWY_QYFZR(23, "企业负责人"),

    /**
     * 高层管理人员.
     */
    FGWY_GCGL(24, "高层管理人员"),

    /**
     * 中层管理人员.
     */
    FGWY_ZCGL(25, "中层管理人员"),

    /**
     * 一般管理人员.
     */
    FGWY_YBGL(26, "一般管理人员"),

    /**
     * 一般正式员工.
     */
    FGWY_YBZSYG(27, "一般正式员工"),

    /**
     * 派遣员工.
     */
    FGWY_PQYG(28, "派遣员工"),

    /**
     * 其他.
     */
    FGWY_QT(99, "其他");


    private Integer code;


    private String name;

    /**
     * Constructor.
     * @param cod Job cod
     * @param nam Job nam
     */
    JobLevelCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * Get name　by code.
     * @param code Job code
     * @return Job name
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
