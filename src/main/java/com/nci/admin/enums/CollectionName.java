/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


import org.apache.commons.lang.enums.EnumUtils;

/**
 * 闪银Mongo集合名称.
 * @author Ligang (ligang@test.com)
 * @version $Id$
 * @since 2016.11.25
 */
public enum CollectionName {

    /**
     * Passport register fail， 新氧.
     */
    ORD_TRACK_INFO("orderTrackInfo"),

    /**
     * 用户基本信息.
     */
    USER_BASE_INFO("userBaseInfo"),

    /**
     * Passport register fail.
     */
    PASSPORT("passportRegistryFail"),

    /**
     * xiaoer_import.auditInfo, Order信息.
     */
    AUDIT_INFO("auditInfo"),

    /**
     * 统一order、新氧order信息.
     */
    LOAN_INFO("loanInfo");

    /**
     * Get function.
     */

    private String name;

    /**
     * Construct with string param.
     * @param name Mongo collection name.
     */
    private CollectionName(String name){
        this.name = name;
    }

    /**
     * MongoName object.
     * @param name Collection name.
     * @return A {@link CollectionName} enum object.
     */
    public static CollectionName getMongoCollectionName(String name) {
        return null;
    }
}
