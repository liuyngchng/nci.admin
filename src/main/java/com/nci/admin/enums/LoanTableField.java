/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

import java.util.ListIterator;


public enum LoanTableField {

    /**
     * Audit status.
     */
    AUDITSTATUS("auditStatus"),

    /**
     * Audit amount.
     */
    AUDITAMOUNT("auditAmount"),

    /**
     * Audit status explain.
     */
    AUDITSTATUSEXPLAIN("auditStatusExplain"),

    /**
     * Audit time.
     */
    AUDITTIME("auditTime"),

    /**
     * User confirm status.
     */
    USERCONFIRMSTATUS("userConfirmStatus"),

    /**
     * Code1 in PictureInfo collection.
     */
    CODE1("code1"),

    /**
     * Code2 in PictureInfo collection.
     */
    CODE2("code2"),

    /**
     * Bid Channel.
     */
    BIDCHANNEL("bidChannel"),

    /**
     * UID.
     */
    UID("uid"),

    /**
     * Apply No.
     */
    APPLYNO("applyNo"),

    /**
     * 第三方订单Id.
     */
    PARTNERAPPLYNO("partnerApplyNo"),

    /**
     * 产品代码.
     */
    PRODUCTCODE("productCode"),

    /**
     * 申请时间.
     */
    APPLYTIME("applyTime"),

    /**
     * Fk
     */
    FKLOANNO("fkLoanNo"),

    /**
     * Loan type.
     */
    LOANTYPE("loanType"),

    /**
     * Trade type.
     */
    TRADETYPE("tradeType"),

    /**
     * risk放回原因.
     */
    RISKRETURNREASON("riskReturnReason"),

    /**
     * 请求ID， applyNo.
     */
    REQUESTID("requestId"),

    /**
     * 请求类型.
     */
    REQUESTTYPE("requestType");

    private String fieldName;

    /**
     * Constructor.
     * @param field 字段名称
     */
    LoanTableField(final String field) {
        this.fieldName = field;
    }

    /**
     * 取枚举.
     * @param field Field name of mongo collection.
     * @return A {@link LoanTableField} instance
     */
    public static LoanTableField getLoanTableField(final String field) {

        return null;
    }

    public String getFieldName() {
        return fieldName;
    }
}
