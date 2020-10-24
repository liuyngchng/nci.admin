/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


/**
 * order申请的各个mongo Collection name.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.06.15
 * Created by LCW on 16/6/15.
 */
public enum LoanCollectionName {

    /**
     * Learning.
     */
    LEARNINGINFO("learningInfo"),

    /**
     * 统一order信息.
     */
    UNITYINFO("unityInfo"),

    /**
     * order申请信息.
     */
    LOANAPPLYINFO("loanApplyInfo"),

    /**
     * 审核信息.
     */
    AUDITINFO("auditInfo"),

    /**
     * 用户基本信息.
     */
    USERBASEINFO("userBaseInfo"),

    /**
     * 用户工作信息.
     */
    USERWORKINFO("userWorkInfo"),

    /**
     * 用户银行信息.
     */
    USERBANKINFO("userBankInfo"),

    /**
     * 联系人信息.
     */
    CONTACTSINFO("contactsInfo"),

    /**
     * 反欺诈信息.
     */
    ANTIFRAUDINFO("antiFraudInfo"),

    /**
     * doc信息.
     */
    PICTUREINFO("pictureInfo"),

    /**
     * riskESB信息.
     */
    FKORDERESBLOG("fkOrderEsbLog"),

    /**
     * 存在错误的order申请信息.
     */
    FAULTY_LOAN_APPLICATION("faultyLoanApplication"),

    /**
     * 信用账户取现.
     */
    WITHDRAW_RE("WithdrawRe");


    private String name;

    /**
     * Constructor.
     * @param nam Mongo collection nam.
     */
    LoanCollectionName(final String nam) {
        this.name = nam;
    }

    /**
     * 根据Collection name取枚举.
     * @param name Collection name
     * @return {@link LoanCollectionName}
     */
    public static LoanCollectionName getLoanCollectionName(final String name) {

        return null;
    }

    public String getName() {
        return name;
    }
}
