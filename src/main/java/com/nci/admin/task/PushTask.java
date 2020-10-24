/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.task;


import com.nci.admin.model.SendEsbMsgParams;
import com.nci.admin.model.base.AuditInfo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xuexue on 2017/9/22.
 */
@Component
public class PushTask implements ApplicationListener<SendApplicationEvent> {


    /**
     * 发送Esb消息的事件
     * @param event 事件.
     */
    @Override
    public void onApplicationEvent(SendApplicationEvent event) {
        SendEsbMsgParams sendInfo = (SendEsbMsgParams) event.getSource();
        int sendCount = 0;
        if(sendInfo.getParamType() == SendEsbMsgParams.PARAM_TYPE.DTO) {
            List<AuditInfo> list = (List<AuditInfo>)sendInfo.getObject();
            for(AuditInfo info : list) {

            }
            sendCount = list.size();
        } else if (sendInfo.getParamType() == SendEsbMsgParams.PARAM_TYPE.STR_LIST) {
            List<String> list = (List<String>)sendInfo.getObject();
            for(String loanId : list){
            }
            sendCount = list.size();
        }

    }
}
