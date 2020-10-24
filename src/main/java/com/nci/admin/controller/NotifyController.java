/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.controller;

import com.alibaba.fastjson.JSONObject;
import com.nci.admin.auth.UserLogger;
import com.nci.admin.model.ThirdNotifyOption;
import com.nci.admin.model.ThirdNotifyItem;
import com.nci.admin.service.NotifyWebService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * .
 * @author Peng Chuanjiang (pengchuanjiang@test.com)
 * @version $Id$
 * @since 2017.02.16
 */
@UserLogger
@Controller
@RequestMapping("notify")
public final class NotifyController {
    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(NotifyController.class);
    /**
     * Constant.
     */
    private static final String ERROR_CODE = "errorCode";

    /**
     * 通知第三方服务.
     */
    @Autowired
    private NotifyWebService notifyWebService;

    /**
     * 主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("index")
    public String index(final HttpServletRequest request) {
        final String auth = NotifyController.auth();
        if (auth != null) {
            request.setAttribute("errorMsg", auth);
            return "common/error";
        }
        return "notify/index";
    }

    /**
     *  列出notify结果.
     * @param option A {@link ThirdNotifyOption} instance.
     * @return Notify 结果
     */
    @ResponseBody
    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String list(final ThirdNotifyOption option) {
        NotifyController.LOGGER.info("option={}", option);
        JSONObject json = new JSONObject();
        final String auth = NotifyController.auth();
        if (auth != null) {
            json.put(ERROR_CODE, 1);
            json.put("errorMessage", auth);
        } else {
            List<ThirdNotifyItem> items = this.notifyWebService.query(option);
            json.put(
                "total",
                option.getSize() * option.getPage() + items.size()
                    + (items.size() == option.getSize() ? 1 : 0)
            );
            json.put("rows", items);
        }
        return json.toString();
    }

    /**
     * 重试.
     * @param id 数据库主键
     * @return 重试结果
     */
    @ResponseBody
    @RequestMapping(value = "retry", method = RequestMethod.POST)
    public String retry(final long id) {
        NotifyController.LOGGER.info("id={}", id);
        JSONObject json = new JSONObject();
        if (this.notifyWebService.retry(id)) {
            json.put(ERROR_CODE, 0);
        } else {
            json.put(ERROR_CODE, "1");
        }
        return json.toString();
    }

    /**
     * Auth结果.
     * @return
     */
    public static String auth() {
        return null;
    }

}
