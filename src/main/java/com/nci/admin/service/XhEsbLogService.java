/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.service;

import com.nci.admin.model.SearchDto;
import com.nci.admin.model.Pagination;
import com.nci.admin.model.fk.ImportEsbLog;

/**
 * orderESB消息查询服务.
 * @author Richard Liu (liuyongcheng@test.com)
 * @since 2017.06.19
 * @version $Id$
 */
public interface XhEsbLogService {

    /**
     * 根据查询条件返回esb日志清单.
     * @param searchDto A {@link SearchDto} instance.
     * @return A {@link ImportEsbLog} list。
     */
    <T> Pagination<T> getPagination(final SearchDto searchDto);

    /**
     * 根据riskID对log进行查找.
     * @param fkLoanNo riskID
     * @return A {@link ImportEsbLog} list.
     */
    ImportEsbLog getEsbLogByFkLoanNo(final String fkLoanNo);

}
