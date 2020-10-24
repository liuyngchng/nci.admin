/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service.impl;

import com.nci.admin.model.ThirdNotifyOption;
import com.nci.admin.model.ThirdNotifyItem;
import com.nci.admin.service.NotifyWebService;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public final class NotifyWebServiceImpl implements NotifyWebService {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NotifyWebServiceImpl.class);



    @Override
    public List<ThirdNotifyItem> query(final ThirdNotifyOption option) {
        NotifyWebServiceImpl.LOGGER.info("option={}", option);

        return null;
    }

    @Override
    public boolean retry(final long id) {
        return false;
    }


    private static List<ThirdNotifyItem> convert(final List<String> dtos) {

        return null;
    }


    private static ThirdNotifyItem convert(final String dto) {
        ThirdNotifyItem item = new ThirdNotifyItem();

        return item;
    }


    private static String convert(final ThirdNotifyOption option) {
        return null;
    }
}
