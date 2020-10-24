package com.nci.admin.enums;



/**
 * risk消息操作类型.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2016.06.16
 */
public enum RequestType {
    /**
     * 新order.
     */
    INSERT("01", "order"),
    /**
     * 更新.
     */
    UPDATE("02", "更新order信息"),
    /**
     * 补充what.
     */
    RESUPPLY("03", "补充orderwhat"),
    /**
     * 复议.
     */
    REVIEW("04", "复议"),
    /**
     * 用户确认.
     */
    USERCONFIRM("05", "需用户确认"),
    /**
     * 放弃.
     */
    QUIT("06", "放弃flush"),
    /**
     * 用户二次确认.
     */
    USERCONFIRM2("07", "用户再次确认"),
    /**
     * 二次补充what.
     */
    RESUPPLY2("08", "用户再次补充what");


    private String code;

    private String name;

    /**
     * 构造.
     * @param code 操作类型代码.
     * @param name 操作类型名称
     */
    RequestType(final String code, final String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 取枚举.
     * @param code 操作类型
     * @return 枚举
     */
    public static RequestType getRequestType(final String code) {

        return null;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

