/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


/**
 * Mongo数据库名称.
 * @author Each Zhang
 * @since 2016.11.08
 */
public enum DbCollection {

    /**
     * order数据库.
     */
    IMPORT("import"),

    /**
     * 信用账户.
     */
    CA("ca"),

    /**
     * 新氧.
     */
    SY("sy"),

    /**
     * 畅游.
     */
    CY("cy"),

    /**
     * 新氧独立的数据库，保存新氧原始数据，以及新氧订单跟踪信息
     */
    XIN_YANG("xiaoer_xinyang"),

    /**
     * 信用账户.
     */
    CREDIT_ACCOUNT("xiaoer_creditaccount"),

    /**
     * 跟谁学直连.
     */
    PATTON("xiaoer_patton");

    /**
     * 数据库名称.
     */
    private String dbName;

    /**
     * Constructor.
     * @param dbNm 数据库名称.
     */
    DbCollection(final String dbNm) {
        this.dbName = dbNm;
    }

    /**
     * 重写toString（）.
     * @return A string
     */
    @Override
    public String toString() {
        return this.dbName;
    }

    public String getDbName() {
        return dbName;
    }
}
