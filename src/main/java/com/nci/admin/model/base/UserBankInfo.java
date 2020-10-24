/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;


import org.hibernate.validator.constraints.NotBlank;


/**
 * Created by LCW on 16/6/14.
 * UserBaseInfo
 */

public class UserBankInfo {

    /**
     * 序列化Id.
     */
    private static final long serialVersionUID = 1L;


    private String id;

    /**
     * Order编号.
     */
    @NotBlank

    private String applyNo;

    /**
     * Going银行卡帐号.
     */
    private String loanAccountName;

    /**
     * Going银行卡号.
     */
    private String loanBankNo;

    /**
     * Going银行卡Code.
     */
    private String loanBankCode;

    /**
     * Going银行卡名字.
     */
    private String loanBankName;

    /**
     * Going银行支行名字.
     */
    private String loanBankBranchName;

    /**
     * Going银行卡省.
     */
    private Integer loanBankProvince;

    /**
     * Going银行省名字.
     */
    private String loanBankProvinceName;

    /**
     * Going银行市.
     */
    private Integer loanBankCity;

    /**
     * Going银行市名字.
     */
    private String loanBankCityName;

    /**
     * 信用卡总张数.
     */
    private Integer creditCardNum;

    /**
     * 工资卡卡号.
     */
    private String salaryCardNo;

    /**
     * 信用卡使用年限.
     */
    private Integer creditCardUseYear;

    /**
     * 常用银行卡号.
     */
    private String commonBankNo;

    /**
     * 划扣银行卡号.
     */
    private String debitBankCardNo;

    /**
     * 划扣银行卡姓名.
     */
    private String debitConsumerName;

    /**
     * 划扣银行卡who号.
     */
    private String debitIdCard;

    /**
     * 划扣银行卡手机号.
     */
    private String debitMobile;

    /**
     * 划扣银行卡银行代码.
     * BS Key:bank.
     */
    private String debitBank;

    /**
     * 划扣银行卡银行名称.
     */
    private String debitBankName;

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

    public String getLoanAccountName() {
        return loanAccountName;
    }

    public void setLoanAccountName(String loanAccountName) {
        this.loanAccountName = loanAccountName;
    }

    public String getLoanBankNo() {
        return loanBankNo;
    }

    public void setLoanBankNo(String loanBankNo) {
        this.loanBankNo = loanBankNo;
    }

    public String getLoanBankCode() {
        return loanBankCode;
    }

    public void setLoanBankCode(String loanBankCode) {
        this.loanBankCode = loanBankCode;
    }

    public String getLoanBankName() {
        return loanBankName;
    }

    public void setLoanBankName(String loanBankName) {
        this.loanBankName = loanBankName;
    }

    public String getLoanBankBranchName() {
        return loanBankBranchName;
    }

    public void setLoanBankBranchName(String loanBankBranchName) {
        this.loanBankBranchName = loanBankBranchName;
    }

    public Integer getLoanBankProvince() {
        return loanBankProvince;
    }

    public void setLoanBankProvince(Integer loanBankProvince) {
        this.loanBankProvince = loanBankProvince;
    }

    public String getLoanBankProvinceName() {
        return loanBankProvinceName;
    }

    public void setLoanBankProvinceName(String loanBankProvinceName) {
        this.loanBankProvinceName = loanBankProvinceName;
    }

    public Integer getLoanBankCity() {
        return loanBankCity;
    }

    public void setLoanBankCity(Integer loanBankCity) {
        this.loanBankCity = loanBankCity;
    }

    public String getLoanBankCityName() {
        return loanBankCityName;
    }

    public void setLoanBankCityName(String loanBankCityName) {
        this.loanBankCityName = loanBankCityName;
    }

    public Integer getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(Integer creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getSalaryCardNo() {
        return salaryCardNo;
    }

    public void setSalaryCardNo(String salaryCardNo) {
        this.salaryCardNo = salaryCardNo;
    }

    public Integer getCreditCardUseYear() {
        return creditCardUseYear;
    }

    public void setCreditCardUseYear(Integer creditCardUseYear) {
        this.creditCardUseYear = creditCardUseYear;
    }

    public String getCommonBankNo() {
        return commonBankNo;
    }

    public void setCommonBankNo(String commonBankNo) {
        this.commonBankNo = commonBankNo;
    }

    public String getDebitBankCardNo() {
        return debitBankCardNo;
    }

    public void setDebitBankCardNo(String debitBankCardNo) {
        this.debitBankCardNo = debitBankCardNo;
    }

    public String getDebitConsumerName() {
        return debitConsumerName;
    }

    public void setDebitConsumerName(String debitConsumerName) {
        this.debitConsumerName = debitConsumerName;
    }

    public String getDebitIdCard() {
        return debitIdCard;
    }

    public void setDebitIdCard(String debitIdCard) {
        this.debitIdCard = debitIdCard;
    }

    public String getDebitMobile() {
        return debitMobile;
    }

    public void setDebitMobile(String debitMobile) {
        this.debitMobile = debitMobile;
    }

    public String getDebitBank() {
        return debitBank;
    }

    public void setDebitBank(String debitBank) {
        this.debitBank = debitBank;
    }

    public String getDebitBankName() {
        return debitBankName;
    }

    public void setDebitBankName(String debitBankName) {
        this.debitBankName = debitBankName;
    }
}
