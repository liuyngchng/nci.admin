/**
 * Copyright (c) 2014-2016, test.com
 * All rights reserved.
 */
package com.nci.admin.utils;

import com.alibaba.fastjson.JSON;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class HttpAgent {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(HttpAgent.class);

    /**
     * User agent key.
     */
    private static final String USR_AGENT = "User-Agent";

    /**
     * User agent value of http request.
     */
    private static final String USER_AGENT = "Mozilla/5.0";

    /**
     * 初始化容量.
     */
    private static final int INITIAL_CAPACITY = 8;

    /**
     * Formatter.
     */
    private static final String FORMATTER = "%s?%s";

    /**
     * Make constructor as private.
     * @throws IllegalAccessException 非法访问异常.
     */
    private HttpAgent() throws IllegalAccessException {
        throw new IllegalAccessException("Illegal access to constructor.");
    }

    /**
     * Send http get request.
     * @param url A Url string.
     * @param params Parameters in form of key value pair.
     * @return The response string.
     */
    public static String sendGet(final String url, final String params) {
        final HttpGet httpGet =
            new HttpGet(String.format(HttpAgent.FORMATTER, url, params));
        httpGet.addHeader(HttpAgent.USR_AGENT, HttpAgent.USER_AGENT);
        String response = null;

        return response;
    }

    /**
     * Sent http post request.
     * @param url A Url for POST action.
     * @param params A {@link Map} instance.
     * @return The response string.
     */
    public static String sendPost(final String url,
        final Map<String, String> params) {
        final HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HttpAgent.USR_AGENT, HttpAgent.USER_AGENT);
        final List<NameValuePair> urlParams =
            new ArrayList<>(HttpAgent.INITIAL_CAPACITY);
        for (final Map.Entry<String, String> entry : params.entrySet()) {
            HttpAgent.addParam(urlParams, entry);
        }
        String response = null;

        return response;
    }

    /**
     * Get request input stream from url connection.
     * @param url Url
     * @return Request result.
     */
    public static InputStream getInputStream(final String url) {
        LOGGER.info("httpRequestUrl: {}", url);
        final URL realUrl;
        final URLConnection connection;
        InputStream inputStream = null;
        try {
            realUrl = new URL(url);
            connection = realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty(
                "user-agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)"
            );
            connection.connect();
            inputStream = connection.getInputStream();
        } catch (final IOException ex) {
            LOGGER.error("IOException in HttpAgent.getInputStream", ex);
        }
        return inputStream;
    }

    /**
     * 添加键值对.
     * @param urlParams A {@link NameValuePair} list.
     * @param entry A {@link Map.Entry} instance.
     * @return A {@link NameValuePair} list.
     */
    private static List<NameValuePair> addParam(
        final List<NameValuePair> urlParams,
        final Map.Entry<String, String> entry) {
        urlParams.add(
            new BasicNameValuePair(entry.getKey(), entry.getValue())
        );
        return urlParams;
    }

    /**
     * 从http返回的流中获取返回的信息.
     * @param inputStream A {@link InputStream} instance
     * @return 字符串内容
     * @throws IOException A {@link IOException} instance
     */
    private static String getResponse(final InputStream inputStream)
        throws IOException {
        final StringBuilder response = new StringBuilder();
        final BufferedReader reader =
            new BufferedReader(new InputStreamReader(inputStream));
        String inputLine;
        do {
            inputLine = reader.readLine();
            if (null != inputLine) {
                response.append(inputLine);
            }
        } while (null != inputLine);
        reader.close();
        return response.toString();
    }
}
