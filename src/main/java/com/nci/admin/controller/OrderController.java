package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.model.ApplySearchDto;
import com.nci.admin.model.AuditSearchDto;
import com.nci.admin.service.IndexService;
import com.nci.admin.model.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 查询order信息.
 */
@UserLogger
@Controller
@RequestMapping("import")
public class OrderController {
    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "d.emergency";

    /**
     * 检索条件公共服务.
     */
    @Autowired
    private IndexService indexService;


    /**
     * order数据静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("index")
    public String importIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "import/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * order数据静态页.
     * @param applySearchDto A {@link ApplySearchDto} instance.
     * @return A string result.
     */
    @RequestMapping("data")
    @ResponseBody
    public Pagination getImportData(final ApplySearchDto applySearchDto) {

        return new Pagination(1,2,3L);
    }

    /**
     * order数据静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("auditInfo/index")
    public String auditInfoIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "auditInfo/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * order数据静态页.
     * @param auditSearchDto A {@link AuditSearchDto} instance.
     * @return A string result.
     */
    @RequestMapping("auditInfo/data")
    @ResponseBody
    public Pagination getAuditInfo(final AuditSearchDto auditSearchDto) {
        return new Pagination(1,2,3L);
    }
}
