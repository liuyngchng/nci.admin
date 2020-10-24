/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.controller;

import javax.servlet.http.HttpServletRequest;

import com.nci.admin.auth.UserLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

/**
 * 首页controller
 * Created by Each.Zhang on 16/11/17.
 */
@UserLogger
@Controller
@RequestMapping("d")
public final class AdminController {

    /**
     * Logger
     */
    private static final Logger LOG =
        LoggerFactory.getLogger(AdminController.class);

    /**
     * who后台主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("index")
    public String index(final HttpServletRequest request) {
        return "common/index";
    }

    /**
     * 退出.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */

    @RequestMapping("logout")
    public String logout(final HttpServletRequest request) {
        return "common/index";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.nci.admin.controller.AdminController");
        Method method = clazz.getMethods()[0];
        System.out.println(method.getClass());
        System.out.println(method.toString());
        System.out.println(method.getName());
        System.out.println(method.getDeclaringClass().getAnnotation(UserLogger.class));
    }
}
