/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


/**
 * Current Locate enum，当前住房情况枚举.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.09.26
 */
public enum CurrentLocate {

    /**
     * Self owned house, 自置无按揭.
     */
    SELF_OWNED(1, 1, "自置无按揭"),

    /**
     * Mortaged house.
     */
    MORTGAGE(2, 2, "自置有按揭"),

    /**
     * Estate shared with others.
     */
    SHARED(3, 6, "共有住宅"),

    /**
     * Rented house.
     */
    RENT(4, 5, "租用"),

    /**
     * Relatives's house.
     */
    RELATIVES_OWNED(5, 3, "亲属楼宇"),

    /**
     * Dormitory, live with fellows.
     */
    DORMITORY(6, 4, "集体宿舍"),

    /**
     * Other case.
     */
    OTHER(7, 7, "其他");

    /**
     * xiaoer code.
     */

    private int xhcode;

    /**
     * Xinyang code.
     */

    private int xycode;

    /**
     * Current locate name.
     */

    private String name;

    /**
     * Constructor.
     * @param xhcode xiaoer code.
     * @param xycode Xinyang code.
     * @param name Current locate name.
     */
    CurrentLocate(int xhcode, int xycode, String name) {
        this.xhcode = xhcode;
        this.xycode = xycode;
        this.name = name;
    }

    /**
     * Get CurrentLocate from xinyang code.
     * @param xhcode xiaoer code.
     * @return A {@link CurrentLocate} instance.
     */
    public static CurrentLocate getLocate(int xhcode) {
        CurrentLocate currentLocate = null;

        return currentLocate;
    }
}
