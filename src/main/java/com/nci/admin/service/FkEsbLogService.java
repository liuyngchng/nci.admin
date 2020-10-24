/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

import com.nci.admin.model.SearchDto;
import com.nci.admin.model.fk.FkOrderEsbLog;
import com.nci.admin.model.Pagination;

/**
 * Created by liangxu on 1/22/17.
 */
public interface FkEsbLogService {
    /**
     * 根据order编号查询esblog.
     * @param id A Mongo id.
     * @return A {@link FkOrderEsbLog} list.
     */
    FkOrderEsbLog getEsbLog(String id);

    /**
     * 根据查询条件返回esb日志清单.
     * @param searchDto A {@link SearchDto} instance.
     * @return A {@link FkOrderEsbLog} list。
     */
    <T> Pagination<T> getPagination(final SearchDto searchDto);

}
