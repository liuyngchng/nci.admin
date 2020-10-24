/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model;

public class SendEsbMsgParams {
    /**
     * 发布事件时处理数据类型.
     */
    public enum PARAM_TYPE{
        /**
         * 根据多个条件查询出的结果.
         */
        DTO,
        /**
         * A String List of loanIds.
         */
        STR_LIST
    }
    private static final long serialVersionUID = 7457317062465708589L;

    /**
     * 操作用户.
     */
    private int uid;
    /**
     * 传参类型
     */
    private PARAM_TYPE paramType;
    /**
     * 传参数据
     */
    private transient Object object;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public PARAM_TYPE getParamType() {
        return paramType;
    }

    public void setParamType(PARAM_TYPE paramType) {
        this.paramType = paramType;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
