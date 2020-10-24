package com.nci.admin.service.impl;

import com.nci.admin.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 权限服务的实现.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.03.27
 */

@Service
public class AuthServiceImpl implements AuthService {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(AuthServiceImpl.class);

    @Override
    public boolean checkPermission(final String permission) {

        return false;
    }
}
