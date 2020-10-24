/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


/**
 * 审核状态
 * @author Richard Liu(liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.12.14
 */
public enum  AuditStatus {

    INIT(0, "未提交"),
    SHEN_HE_ZHONG(1, "审核中"),
    FANG_KUAN_ZHONG(2, "Going中"),
    HUAN_KUAN_ZHONG(3, "Getting中"),
    SHEN_HE_JU_JUE(4, "审核拒绝"),
    YI_FEI_QI(5, "已废弃"),
    YI_JIE_QING(6, "已结清"),
    YI_SUN_SHI(7, "已损失"),
    BU_CONG_ZI_LIAO(8, "补充what中"),
    SHEN_HE_TONG_GUO(9, "审核通过"),
    QUE_REN_ZHONG(10, "确认中"),
    FU_YI(11, "复议中"),
    JIN_JIAN_ZHONG(12, "order中"),
    YU_QI(13, "已expired"),
    FANG_KUAN_SHI_BAI(14, "Going失败"),
    FANG_BIAO_SHI_BAI(15, "放标失败"),
    FANG_BIAO_ZHONG(16, "fowrard"),
    JIN_JIAN_SHI_BAI(17, "order失败");


    private int status;


    private String desc;

    AuditStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    /**
     * 取枚举
     * @param status
     * @return {@link AuditStatus}
     */
    public static AuditStatus getAuditStatus(int status) {

        return null;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
