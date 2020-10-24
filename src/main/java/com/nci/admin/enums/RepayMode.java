/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;



/**
 * Getting方式.
 * @author Richard Liu(liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.12.13.
 */
public enum RepayMode {
    DENG_ER_BEN_XI(1, "等额本息"),
    XIAN_XI_HOU_BEN(2, "先息后本"),
    YI_CIB_JIE_QING(3, "一次结清"),
    DENG_BEN_DENG_XI(4, "等额等息"),
    DAO_QI_JIE_QING(5, "到期结清"),
    YI_CI_FU_XI(6, "一次付清");

    private Integer mode;

    private String name;

    RepayMode(Integer mode, String name) {
        this.mode = mode;
        this.name = name;
    }

    /**
     * 取枚举
     * @param mode
     * @return {@link RepayMode}
     */
    public static RepayMode getRepayMode(Integer mode) {

        return null;
    }
}
