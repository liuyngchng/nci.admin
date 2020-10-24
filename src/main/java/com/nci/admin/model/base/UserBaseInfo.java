/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;

import java.io.Serializable;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by LCW on 16/6/13.
 */

public class UserBaseInfo {

    /**
     * 序列化ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Mongo id.
     */
    private String id;
    /**
     * Order编号.
     */
    @NotBlank
     private String applyNo;
    /**
     * 用户id.
     */
     private Long uid;
    /**
     * flush人姓名.
     */
    private String name;
    /**
     * 年龄.
     */
    private Integer age;
    /**
     * 手机号.
     */
    private String mobile;
    /**
     * who号.
     */
    private String idCardNo;
    /**
     * 是否认证ID5.
     */
    private Integer idCardStatus;
    /**
     * 邮箱.
     */
    @Email
    private String email;
    /**
     * 婚姻状态.
     */
    private Integer marryStatus;
    /**
     * 学历.
     */
    private Integer education;
    /**
     * 居住省.
     */
    private Integer liveProvince;
    /**
     * 居住省名字.
     */
    private String liveProvinceName;
    /**
     * 居住市.
     */
    private Integer liveCity;
    /**
     * 居住市名字.
     */
    private String liveCityName;
    /**
     * 居住县.
     */
    private Integer liveCounty;
    /**
     * 居住县名字.
     */
    private String liveCountyName;
    /**
     * 居住街道详情.
     */
    private String liveArea;
    /**
     * 居住年限.
     */
    private Integer liveYear;
    /**
     * ip.
     */
    private String ip;
    /**
     * 设备详情.
     */
    private String deviceInfo;
    /**
     * 家庭省.
     */
    private Integer familyProvince;
    /**
     * 家庭省名字.
     */
    private String familyProvinceName;
    /**
     * 家庭市.
     */
    private Integer familyCity;
    /**
     * 家庭市名字.
     */
    private String familyCityName;
    /**
     * 家庭县.
     */
    private Integer familyCounty;
    /**
     * 家庭县名字.
     */
    private String familyCountyName;
    /**
     * 家庭街道详情.
     */
    private String familyArea;
    /**
     * 居住情况.
     * BS:nowFamily.
     */
    private Integer nowFamily;
    /**
     * ip省.
     */
    private Integer ipProvince;
    /**
     * ip省名字.
     */
    private String ipProvinceName;
    /**
     * ip市.
     */
    private Integer ipCity;
    /**
     * ip市名字.
     */
    private String ipCityName;
    /**
     * bl类虚拟户id.
     */
    private String virtualAccountId;
    /**
     * 毕业院校.
     */
    private String gradSchool;
    /**
     * 专业.
     */
    private String subject;
    /**
     * 租房地址（省）.
     * BS.
     */
    private Integer rentProvince;
    /**
     * 租房地址（省）.
     */
    private String rentProvinceName;
    /**
     * 租房地址（市）.
     * BS.
     */
    private Integer rentCity;
    /**
     * 租房地址（市）.
     */
    private String rentCityName;
    /**
     * 租房地址（区）.
     */
    private Integer rentArea;
    /**
     * 租房地址（区）.
     */
    private String rentAreaName;
    /**
     * 租房详细地址.
     */
    private String rentAddress;
    /**
     * 起租日.
     * yyyyMMdd.
     */
    private String rentStartDay;
    /**
     * 到期日.
     * yyyyMMdd.
     */
    private String rentEndDay;
    /**
     * 交租日期.
     * 5号交租，填5.
     */
    private Integer rentDay;

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

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getIdCardStatus() {
        return idCardStatus;
    }

    public void setIdCardStatus(Integer idCardStatus) {
        this.idCardStatus = idCardStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(Integer marryStatus) {
        this.marryStatus = marryStatus;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getLiveProvince() {
        return liveProvince;
    }

    public void setLiveProvince(Integer liveProvince) {
        this.liveProvince = liveProvince;
    }

    public String getLiveProvinceName() {
        return liveProvinceName;
    }

    public void setLiveProvinceName(String liveProvinceName) {
        this.liveProvinceName = liveProvinceName;
    }

    public Integer getLiveCity() {
        return liveCity;
    }

    public void setLiveCity(Integer liveCity) {
        this.liveCity = liveCity;
    }

    public String getLiveCityName() {
        return liveCityName;
    }

    public void setLiveCityName(String liveCityName) {
        this.liveCityName = liveCityName;
    }

    public Integer getLiveCounty() {
        return liveCounty;
    }

    public void setLiveCounty(Integer liveCounty) {
        this.liveCounty = liveCounty;
    }

    public String getLiveCountyName() {
        return liveCountyName;
    }

    public void setLiveCountyName(String liveCountyName) {
        this.liveCountyName = liveCountyName;
    }

    public String getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(String liveArea) {
        this.liveArea = liveArea;
    }

    public Integer getLiveYear() {
        return liveYear;
    }

    public void setLiveYear(Integer liveYear) {
        this.liveYear = liveYear;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public Integer getFamilyProvince() {
        return familyProvince;
    }

    public void setFamilyProvince(Integer familyProvince) {
        this.familyProvince = familyProvince;
    }

    public String getFamilyProvinceName() {
        return familyProvinceName;
    }

    public void setFamilyProvinceName(String familyProvinceName) {
        this.familyProvinceName = familyProvinceName;
    }

    public Integer getFamilyCity() {
        return familyCity;
    }

    public void setFamilyCity(Integer familyCity) {
        this.familyCity = familyCity;
    }

    public String getFamilyCityName() {
        return familyCityName;
    }

    public void setFamilyCityName(String familyCityName) {
        this.familyCityName = familyCityName;
    }

    public Integer getFamilyCounty() {
        return familyCounty;
    }

    public void setFamilyCounty(Integer familyCounty) {
        this.familyCounty = familyCounty;
    }

    public String getFamilyCountyName() {
        return familyCountyName;
    }

    public void setFamilyCountyName(String familyCountyName) {
        this.familyCountyName = familyCountyName;
    }

    public String getFamilyArea() {
        return familyArea;
    }

    public void setFamilyArea(String familyArea) {
        this.familyArea = familyArea;
    }

    public Integer getNowFamily() {
        return nowFamily;
    }

    public void setNowFamily(Integer nowFamily) {
        this.nowFamily = nowFamily;
    }

    public Integer getIpProvince() {
        return ipProvince;
    }

    public void setIpProvince(Integer ipProvince) {
        this.ipProvince = ipProvince;
    }

    public String getIpProvinceName() {
        return ipProvinceName;
    }

    public void setIpProvinceName(String ipProvinceName) {
        this.ipProvinceName = ipProvinceName;
    }

    public Integer getIpCity() {
        return ipCity;
    }

    public void setIpCity(Integer ipCity) {
        this.ipCity = ipCity;
    }

    public String getIpCityName() {
        return ipCityName;
    }

    public void setIpCityName(String ipCityName) {
        this.ipCityName = ipCityName;
    }

    public String getVirtualAccountId() {
        return virtualAccountId;
    }

    public void setVirtualAccountId(String virtualAccountId) {
        this.virtualAccountId = virtualAccountId;
    }

    public String getGradSchool() {
        return gradSchool;
    }

    public void setGradSchool(String gradSchool) {
        this.gradSchool = gradSchool;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getRentProvince() {
        return rentProvince;
    }

    public void setRentProvince(Integer rentProvince) {
        this.rentProvince = rentProvince;
    }

    public String getRentProvinceName() {
        return rentProvinceName;
    }

    public void setRentProvinceName(String rentProvinceName) {
        this.rentProvinceName = rentProvinceName;
    }

    public Integer getRentCity() {
        return rentCity;
    }

    public void setRentCity(Integer rentCity) {
        this.rentCity = rentCity;
    }

    public String getRentCityName() {
        return rentCityName;
    }

    public void setRentCityName(String rentCityName) {
        this.rentCityName = rentCityName;
    }

    public Integer getRentArea() {
        return rentArea;
    }

    public void setRentArea(Integer rentArea) {
        this.rentArea = rentArea;
    }

    public String getRentAreaName() {
        return rentAreaName;
    }

    public void setRentAreaName(String rentAreaName) {
        this.rentAreaName = rentAreaName;
    }

    public String getRentAddress() {
        return rentAddress;
    }

    public void setRentAddress(String rentAddress) {
        this.rentAddress = rentAddress;
    }

    public String getRentStartDay() {
        return rentStartDay;
    }

    public void setRentStartDay(String rentStartDay) {
        this.rentStartDay = rentStartDay;
    }

    public String getRentEndDay() {
        return rentEndDay;
    }

    public void setRentEndDay(String rentEndDay) {
        this.rentEndDay = rentEndDay;
    }

    public Integer getRentDay() {
        return rentDay;
    }

    public void setRentDay(Integer rentDay) {
        this.rentDay = rentDay;
    }
}
