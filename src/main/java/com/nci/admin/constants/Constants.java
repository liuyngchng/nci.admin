/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.constants;

import java.text.MessageFormat;

/**
 * Created by xuexue on 2017/9/25.
 */
public class Constants {
    private Constants() {}

    /**
     * 将发送esb消息结果放入redis的set集合中,此为前缀.
     */
    public static final String REDIS_KEY_SEND_MSG = "admin:send:esb:log";
    /**
     * 发送esb结果.
     */
    public static final String SEND_ESB_LOG_KEY = REDIS_KEY_SEND_MSG + ":user_id_{0}";
    /**
     * 发送esb的条数.
     */
    public static final String SEND_ESB_LOG_COUNT_KEY = REDIS_KEY_SEND_MSG + ":count:user_id_{0}";
    /**
     * 前端返回格式.
     */
    public static final String RTN_MSG = "'{'\"code\":\"0\", \"msg\":\"{0}\"'}'";
    /**
     * 返回空信息.
     */
    public static final String RTN_MSG_BLANK = MessageFormat.format(RTN_MSG, "");
}
