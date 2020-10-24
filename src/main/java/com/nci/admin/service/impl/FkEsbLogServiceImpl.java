/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service.impl;

import com.alibaba.fastjson.JSON;

import com.nci.admin.model.SearchDto;
import com.nci.admin.model.fk.FkOrderEsbLog;
import com.nci.admin.service.FkEsbLogService;
import java.util.List;

import com.nci.admin.model.Pagination;
import org.slf4j.LoggerFactory;


import org.springframework.stereotype.Service;


@Service
public class FkEsbLogServiceImpl implements FkEsbLogService {

    private static final org.slf4j.Logger LOGGER =
        LoggerFactory.getLogger(FkEsbLogServiceImpl.class);


    /**
     * Request Id.
     */
    private static final String REQUEST_ID = "requestId";

    /**
     * LOANID.
     */
    private static final String LOAN_ID = "loanId";

    @Override
    public FkOrderEsbLog getEsbLog(final String id) {
        return null;
    }

    @Override
    public <T> Pagination<T> getPagination(final SearchDto searchDto) {
        return null;
    }


    private List<FkOrderEsbLog> getOrderList(SearchDto searchDto) {
        return null;
    }



    private List<FkOrderEsbLog> getData(final String query) {
        return null;
    }


    private long count(final String query) {
        return 0;
    }

    private static String getQuery(final SearchDto searchDto) {
        return null;
    }


    private static String getCountQuery(final SearchDto searchDto) {
        return null;
    }

    /**
     * 格式化数据.
     * @param esbLogs A {@link FkOrderEsbLog} list.
     */
    private static List<FkOrderEsbLog> formatData(final List<FkOrderEsbLog> esbLogs) {
        for (FkOrderEsbLog log : esbLogs) {
            log.setJson(JSON.toJSONString(log));
            FkEsbLogServiceImpl.formatBizStatus(log);
            FkEsbLogServiceImpl.formatMsgType(log);
            FkEsbLogServiceImpl.formatRequestType(log);
        }
        return esbLogs;
    }

    /**
     * 设置请求类型.
     * @param log A {@link FkOrderEsbLog} instance.
     */
    private static void formatRequestType(final FkOrderEsbLog log) {

    }

    /**
     * 设置消息类型.
     * @param log A {@link FkOrderEsbLog} instance.
     */
    private static void formatMsgType(final FkOrderEsbLog log) {

    }

    /**
     * 设置审核状态.
     * @param log A {@link FkOrderEsbLog} instance.
     */
    private static void formatBizStatus(final FkOrderEsbLog log) {

    }
}
