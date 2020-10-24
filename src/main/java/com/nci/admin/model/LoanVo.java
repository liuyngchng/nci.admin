/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model;

import com.nci.admin.model.base.*;
import com.nci.admin.model.base.AuditInfo;
import com.nci.admin.model.base.ContactsInfo;
import com.nci.admin.model.base.LoanApplyInfo;
import com.nci.admin.model.base.UserBankInfo;
import com.nci.admin.model.base.UserBaseInfo;
import com.nci.admin.model.base.UserWorkInfo;

import java.io.Serializable;
import java.util.List;
/**
 * Created by Each.Zhang on 16/11/7.
 * 信用账户相关信息.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.11.07
 */

public class LoanVo implements Serializable {

    private static final long serialVersionUID = -5469607753737199574L;
    /**
     * order申请信息.
     */
    private LoanApplyInfo loanApplyInfo;

    /**
     * order审核信息.
     */
    private AuditInfo auditInfo;

    /**
     * 用户基本信息.
     */
    private UserBaseInfo userBaseInfo;

    /**
     * 用户银行信息.
     */
    private UserBankInfo userBankInfo;


    /**
     * 用户工作情况信息.
     */
    private UserWorkInfo userWorkInfo;

    /**
     * 联系人信息.
     */
    private ContactsInfo contactsInfo;

    /**
     * doc信息清单.
     */
    private List<PictureInfo> pictureInfoList;

    /**
     * 是否已锁定RedisKey.
     */
    private Boolean isLock;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LoanApplyInfo getLoanApplyInfo() {
        return loanApplyInfo;
    }

    public void setLoanApplyInfo(LoanApplyInfo loanApplyInfo) {
        this.loanApplyInfo = loanApplyInfo;
    }

    public AuditInfo getAuditInfo() {
        return auditInfo;
    }

    public void setAuditInfo(AuditInfo auditInfo) {
        this.auditInfo = auditInfo;
    }

    public UserBaseInfo getUserBaseInfo() {
        return userBaseInfo;
    }

    public void setUserBaseInfo(UserBaseInfo userBaseInfo) {
        this.userBaseInfo = userBaseInfo;
    }

    public UserBankInfo getUserBankInfo() {
        return userBankInfo;
    }

    public void setUserBankInfo(UserBankInfo userBankInfo) {
        this.userBankInfo = userBankInfo;
    }

    public UserWorkInfo getUserWorkInfo() {
        return userWorkInfo;
    }

    public void setUserWorkInfo(UserWorkInfo userWorkInfo) {
        this.userWorkInfo = userWorkInfo;
    }

    public ContactsInfo getContactsInfo() {
        return contactsInfo;
    }

    public void setContactsInfo(ContactsInfo contactsInfo) {
        this.contactsInfo = contactsInfo;
    }

    public List<PictureInfo> getPictureInfoList() {
        return pictureInfoList;
    }

    public void setPictureInfoList(List<PictureInfo> pictureInfoList) {
        this.pictureInfoList = pictureInfoList;
    }

    public Boolean getLock() {
        return isLock;
    }

    public void setLock(Boolean lock) {
        isLock = lock;
    }
}
