/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

/**
 * Loan type used.
 * @author Richard Liu (liuyongcheng@xiaoer)
 * @version $Id$
 * @since 2016.09.18
 */
public enum LoanType {

    /**
     * 统一order（教育）.
     */
    TYX(20, "统一order（教育）"),

    /**
     * 统一order（医美）.
     */
    TYM(21, "统一order（医美）"),
    /**
     * 统一order（房贷）.
     */
    TYF(22, "统一order（房贷）"),

    /**
     * 统一order消费贷.
     */
    TYXF(32, "统一order消费贷"),

    /**
     * 统一order（教育） LoanType.
     */
    XINYANG(25, "新氧");

    private int code;


    private String name;

    /**
     * Constructor.
     * @param code Loan type code.
     * @param name Loan type name.
     */
    LoanType(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据code获取{@link LoanType}枚举
     * @param code loanType code
     * @return {@link LoanType} instance.
     */
    public static LoanType getLoanType(final int code) {
        LoanType loanType = null;

        return loanType;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
