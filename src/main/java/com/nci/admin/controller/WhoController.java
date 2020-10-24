package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.model.Pagination;
import com.nci.admin.model.RepaySearchDto;
import com.nci.admin.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 * whoGetting相关信息查询.
 * @author Wang zhenji (wangzhenji@test.com)
 */
@UserLogger
@Controller
@RequestMapping("rp")
public class WhoController {
    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "d.emergency";

    private static final Logger LOGGER =
        LoggerFactory.getLogger(WhoController.class);

    @Autowired
    private IndexService indexService;
    /**
     * Getting数据静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("index")
    public String importIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "repay/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     *单笔flushGetting列表.
     * @param repaySearchDto A RepaySearchDto instance.
     * @return A Pagination containing a list of repay items.
     */
    @RequestMapping("data")
    @ResponseBody
    public Pagination getRepayList(RepaySearchDto repaySearchDto){
        final Pagination page = new Pagination<>(1, 10, 0);

        return page;
    }

    private List<String> getRepayItems(RepaySearchDto repaySearchDto){

        return null;
    }
}
