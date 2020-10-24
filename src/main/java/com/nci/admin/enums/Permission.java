/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;


/**
 * Auth中配置的权限的Key.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.03.27
 */
public enum Permission {

    /**
     * 读权限.
     */
    xr_CI_READ("xr.ci.read"),

    /**
     * 写权限.
     */
    xr_CI_WRITE("xr.ci.write"),

    /**
     * 导出权限.
     */
    xr_CI_DUMP("xr.ci.dump"),

    /**
     * 更新order数据权限.
     */
    xr_IMPORT_UPDAT("xr.import.update");

    /**
     * 权限key的值.
     */

    private String key;


    /**
     * 构造函数.
     * @param keyVal 权限的值.
     */
    Permission(final String keyVal) {
        this.key = keyVal;
    }

    public String getKey() {
        return key;
    }
}
