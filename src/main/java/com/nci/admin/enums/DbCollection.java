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
    IMPORT("import");

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
