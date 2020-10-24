/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


/**
 * Marriage status.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.09.26
 */
public enum MarriageStatus {

    /**
     * Married, 已婚.
     */
    MARRIED(1, 2, "已婚"),

    /**
     * Single, 未婚.
     */
    SINGLE(2, 1, "未婚"),

    /**
     * Divorced, 离异.
     */
    DIVORCE(3, 3,"离异"),

    /**
     * Other case, 丧偶，其他
     */
    OTHER(5, 4, "其他");


    private int xhcode;


    private int xycode;

    private String name;

    /**
     * MarriageStatus constructor.
     * @param xhcode xiaoer Marriage status.
     * @param xycode Xinyang marriage status.
     * @param name Marriage status name.
     */
    MarriageStatus(final int xhcode, final int xycode, String name) {
        this.xhcode = xhcode;
        this.xycode = xycode;
        this.name = name;
    }

    /**
     * Get MarriageStatus enum from xinyang code.
     * @param xhcode xiaoer marriage status code.
     * @return A {@link MarriageStatus} instance.
     */
    public static MarriageStatus getMarriageStatus(final int xhcode) {
        MarriageStatus marriageStatus = null;

        return marriageStatus;
    }

    public int getXhcode() {
        return xhcode;
    }

    public int getXycode() {
        return xycode;
    }

    public String getName() {
        return name;
    }
}
