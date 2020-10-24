/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Health check.
 * @author Each Zhang
 */
@UserLogger
@Controller
@RequestMapping("h")
public final class HcController {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(HcController.class);

    /**
     * Constance.
     */
    private static final String HEALTH_CHECK_OK = "ok";


    /**
     * 健康检查
     * @return 健康检查结果
     */
    @RequestMapping("check")
    @ResponseBody
    public Object health() {
        return HEALTH_CHECK_OK;
    }

    /**
     * 健康检查
     * @return 健康检查结果
     */
    @RequestMapping("test")
    @ResponseBody
    public Object test() {
        return HEALTH_CHECK_OK;
    }
}
