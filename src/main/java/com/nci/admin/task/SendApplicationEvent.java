/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.task;

import com.nci.admin.model.SendEsbMsgParams;
import org.springframework.context.ApplicationEvent;

/**
 * Created by xuexue on 2017/9/25.
 */
public class SendApplicationEvent extends ApplicationEvent{
    public SendApplicationEvent(SendEsbMsgParams source) {
        super(source);
    }
}
