/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


import java.util.ListIterator;


/**
 * Getting方式.
 * @author Richard Liu(liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.12.13.
 */
public enum RepayStatus {
    NOT_PAY(0, "Getting中"),
    OVER_DUE(1, "已expired"),
    SQUARE_UP(2, "已结清"),
    REPAYING(99, "Getting处理中");

    private Integer status;


    private String name;

    RepayStatus(Integer mode, String name) {
        this.status = mode;
        this.name = name;
    }

    /**
     * 取枚举
     * @param status
     * @return {@link RepayStatus}
     */
    public static RepayStatus getRepayMode(Integer status) {

        return null;
    }

    public Integer getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
