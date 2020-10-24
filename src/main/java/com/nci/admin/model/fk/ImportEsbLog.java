package com.nci.admin.model.fk;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;


import java.io.Serializable;



public class ImportEsbLog implements Serializable {

    private static final long serialVersionUID = -282863860627763778L;
    /**
     * Mongo id.
     */
    private String _id;

    /**
     * 消息类型.
     */
    private String msgType;

    /**
     * Esb发送结果.
     */
    private String esbSendResult;

    /**
     * order数据.
     */
    private ImportData data;

    @JSONField(serialize = false)
    private String json;

    /**
     * Esb消息JSon串.
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static class ImportData implements Serializable {

        private static final long serialVersionUID = 682891885877027026L;


        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }

    }
}
