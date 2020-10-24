/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

import com.nci.admin.model.ThirdNotifyOption;
import com.nci.admin.model.ThirdNotifyItem;
import java.util.List;

/**
 * .
 * @author Peng Chuanjiang (pengchuanjiang@)
 * @version $Id$
 * @since 2017.02.16
 */
public interface NotifyWebService {

    /**
     * 查询通知第三方的结果.
     * @param option A {@link ThirdNotifyOption} instance.
     * @return 通知第三方的结果
     */
    List<ThirdNotifyItem> query(ThirdNotifyOption option);

    /**
     * 重试.
     * @param id 消息主键
     * @return 是否成功
     */
    boolean retry(long id);
}
