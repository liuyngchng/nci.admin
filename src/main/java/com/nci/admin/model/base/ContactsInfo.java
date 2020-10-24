/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;



public class ContactsInfo  {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * Order编号.
     */
    @NotBlank
     private String applyNo;

    /**
     * 亲属姓名.
     */
    private String familyName;

    /**
     * 亲属手机号.
     */
    private String familyMobile;

    /**
     * 亲属关系.
     */
    private Integer familyRelation;

    /**
     * 工作证明人姓名.
     */
    private String workRefereeName;

    /**
     * 工作证明人手机号.
     */
    private String workRefereeMobile;

    /**
     * 其它联系人.
     */
    private List<OtherContactsInfo> otherConInfoList;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyMobile() {
        return familyMobile;
    }

    public void setFamilyMobile(String familyMobile) {
        this.familyMobile = familyMobile;
    }

    public Integer getFamilyRelation() {
        return familyRelation;
    }

    public void setFamilyRelation(Integer familyRelation) {
        this.familyRelation = familyRelation;
    }

    public String getWorkRefereeName() {
        return workRefereeName;
    }

    public void setWorkRefereeName(String workRefereeName) {
        this.workRefereeName = workRefereeName;
    }

    public String getWorkRefereeMobile() {
        return workRefereeMobile;
    }

    public void setWorkRefereeMobile(String workRefereeMobile) {
        this.workRefereeMobile = workRefereeMobile;
    }

    public List<OtherContactsInfo> getOtherConInfoList() {
        return otherConInfoList;
    }

    public void setOtherConInfoList(List<OtherContactsInfo> otherConInfoList) {
        this.otherConInfoList = otherConInfoList;
    }
}
