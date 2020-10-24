/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;


import org.hibernate.validator.constraints.NotBlank;


public class PictureInfo {
    private static final long serialVersionUID = 1L;

    /**
     * Mongo collection Id.
     */

    private String id;
    /**
     * Order编号.
     */
    @NotBlank
    private String applyNo;
    /**
     * doc一级类别.
     */
    @NotBlank
     private String code1;
    /**
     * doc二级类别.
     */
    @NotBlank
     private String code2;
    /**
     * 原图地址.
     */
    private String url;
    /**
     * 缩略图地址.
     */
    private String minUrl;
    /**
     * http地址doc.
     */
    private String webUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMinUrl() {
        return minUrl;
    }

    public void setMinUrl(String minUrl) {
        this.minUrl = minUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
