/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


/**
 * risk返回原因.
 * Created by Each.Zhang on 16/11/16.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.11.16
 */
public enum RiskReturnReasonCollection {

    /**
     * 成功.
     */
    CG(0, "成功"),

    /**
     * risk校验失败.
     */
    FKJYSB(1, "risk校验失败"),

    /**
     * 未create.
     */
    WSX(2, "未create"),

    /**
     * amount不可用.
     */
    EDBKY(3, "amount不可用"),

    /**
     * amount不足.
     */
    EDBZ(4, "amount不足");


    private Integer code;


    private String name;

    /**
     * Constructor
     * @param cod Return cod
     * @param nam Return code代表的含义
     */
    RiskReturnReasonCollection(final Integer cod, final String nam) {
        this.code = cod;
        this.name = nam;
    }

    /**
     * 通过Code获取code代表的含义.
     * @param code Return code
     * @return Code代表的含义
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
