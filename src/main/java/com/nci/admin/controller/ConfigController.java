package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 配置信息.
 * @author Richard Liu(liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.09.15
 */
@UserLogger
@Controller
@RequestMapping("config")
public final class ConfigController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigController.class);
    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "d.emergency";


    /**
     * 检索条件公共服务.
     */
    @Autowired
    private IndexService indexService;

    /**
     * 配置主页.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @RequestMapping("index")
    public String configIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "config/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 查询配置信息.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @ResponseBody
    @RequestMapping(value = "data", method = RequestMethod.POST)
    public String getConfigInfo(final HttpServletRequest request) {
        final String configKey = request.getParameter("configKey");
        final String configValue = "";
        LOGGER.info("getConfigInfo, configKey {} configValue {}", configKey, configValue);
        return configValue;
    }

    /**
     * 更新配置信息.
     * @param request A {@link HttpServletRequest} instance
     * @return A string result
     */
    @ResponseBody
    @RequestMapping(value = "refresh", method = RequestMethod.POST)
    public boolean refreshConfig(final HttpServletRequest request) {
        final String configKey = request.getParameter("configKey");
        final String configValue;
        try {
            configValue = URLDecoder.decode(request.getParameter("configValue"), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            LOGGER.error("UnsupportedEncodingException", ex);
            return false;
        }
        LOGGER.info(
            "refreshConfig, configKey {}, configValue {}",
            configKey,
            configValue
        );
        boolean result = false;
        LOGGER.info("refreshConfig result: {}", result);
        return result;
    }
}
