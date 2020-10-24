package com.nci.admin.service;

/**
 * 权限服务. 
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.03.27
 */
public interface AuthService {

    /**
     * 检查当前用户是否拥有permission指定的权限.
     * @param permission 权限key
     * @return True： 拥有权限，False：没有权限
     */
    boolean checkPermission(String permission);
}
