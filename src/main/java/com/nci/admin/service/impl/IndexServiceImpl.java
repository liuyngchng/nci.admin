/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service.impl;


import com.nci.admin.service.IndexService;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

/**
 * Created by LX on 1/4/17.
 */
@Service
public class IndexServiceImpl implements IndexService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexServiceImpl.class);
    private static final String ERROR_PAGE_URL = "common/error";

    @Override
    public String showIndexPage(HttpServletRequest request, String indexUrl, String permission) {
        return null;
    }
}
