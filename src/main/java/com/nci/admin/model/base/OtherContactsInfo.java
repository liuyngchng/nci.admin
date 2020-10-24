/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.model.base;


/**
 * Created by LCW on 16/6/13.
 * Mongo collection contactInfo.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.06.13
 */

public class OtherContactsInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 其它联系人与flush人的关系.
     */
    private Integer otherCntRelationType;
    /**
     * 其它证明人手机号.
     */
    private String otherCntMobile;
    /**
     * 其它证明人姓名.
     */
    private String otherCntName;

    public Integer getOtherCntRelationType() {
        return otherCntRelationType;
    }

    public void setOtherCntRelationType(Integer otherCntRelationType) {
        this.otherCntRelationType = otherCntRelationType;
    }

    public String getOtherCntMobile() {
        return otherCntMobile;
    }

    public void setOtherCntMobile(String otherCntMobile) {
        this.otherCntMobile = otherCntMobile;
    }

    public String getOtherCntName() {
        return otherCntName;
    }

    public void setOtherCntName(String otherCntName) {
        this.otherCntName = otherCntName;
    }
}
