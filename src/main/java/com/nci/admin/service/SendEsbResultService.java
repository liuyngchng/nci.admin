/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

/**
 * Created by xuexue on 2017/9/25.
 */
public interface SendEsbResultService {
    /**
     * 保存字符串数据至redis
     * @param key redis键.
     * @param data 需要存入的string.
     */
    void push(String key, String data);

    /**
     * 保存log信息至集合.
     * @param key redis键.
     * @param data 需要存入的日志String.
     */
    void pushMember(String key, String data);

    /**
     * 移除redis内容
     * @param key 存放log集合的键.
     * @param countKey 存放发送条数的键.
     */
    void remove(String key, String countKey);

    /**
     * 读取redis内容
     * @param key 存放log集合的键.
     * @param countKey 存放发送条数的键.
     * @return log内容.
     */
    String read(String key, String countKey);
}
