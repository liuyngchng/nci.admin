/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;


public class UserWorkInfo {
    private static final long serialVersionUID = 1L;

    /**
     * Mongo ID.
     */
    private String id;
    /**
     * Order编号.
     */
    @NotBlank
    private String applyNo;
    /**
     * 单位名称.
     */
    private String companyName;
    /**
     * 单位电话.
     */
    private String companyTel;
    /**
     * 单位性质.
     */
    private Integer companyType;
    /**
     * 单位邮箱.
     */
    @Email
    private String companyEmail;
    /**
     * 职位级别.
     */
    private Integer positionLevel;
    /**
     * 工作年限.
     */
    private Integer workYear;
    /**
     * 工资.
     */
    private Long salary;
    /**
     * 发薪日.
     */
    private Integer salaryDay;
    /**
     * 省.
     */
    private Integer companyProvince;
    /**
     * 省名字.
     */
    private String companyProvinceName;
    /**
     * 市.
     */
    private Integer companyCity;
    /**
     * 市名字.
     */
    private String companyCityName;
    /**
     * 县.
     */
    private Integer companyCounty;
    /**
     * 县名字.
     */
    private String companyCountyName;
    /**
     * 街道详情.
     */
    private String companyArea;
    /**
     * 社保情况.
     * 1有社保2无社保3未提供.
     */
    private Integer socialSecurityStatus;
    /**
     * 企业邮箱验证状态.
     * 0未验证,1已验证.
     */
    private Integer companyEmailStatus;
    /**
     * 职业类别.
     * BS字典值jobType.
     */
    private Integer jobType;

    /**
     * 职位
     */
    private String position;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public Integer getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(Integer positionLevel) {
        this.positionLevel = positionLevel;
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(Integer salaryDay) {
        this.salaryDay = salaryDay;
    }

    public Integer getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(Integer companyProvince) {
        this.companyProvince = companyProvince;
    }

    public String getCompanyProvinceName() {
        return companyProvinceName;
    }

    public void setCompanyProvinceName(String companyProvinceName) {
        this.companyProvinceName = companyProvinceName;
    }

    public Integer getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(Integer companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyCityName() {
        return companyCityName;
    }

    public void setCompanyCityName(String companyCityName) {
        this.companyCityName = companyCityName;
    }

    public Integer getCompanyCounty() {
        return companyCounty;
    }

    public void setCompanyCounty(Integer companyCounty) {
        this.companyCounty = companyCounty;
    }

    public String getCompanyCountyName() {
        return companyCountyName;
    }

    public void setCompanyCountyName(String companyCountyName) {
        this.companyCountyName = companyCountyName;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    public Integer getSocialSecurityStatus() {
        return socialSecurityStatus;
    }

    public void setSocialSecurityStatus(Integer socialSecurityStatus) {
        this.socialSecurityStatus = socialSecurityStatus;
    }

    public Integer getCompanyEmailStatus() {
        return companyEmailStatus;
    }

    public void setCompanyEmailStatus(Integer companyEmailStatus) {
        this.companyEmailStatus = companyEmailStatus;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
