package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.model.BaoFooPayLogSearchVO;
import com.nci.admin.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nci.admin.model.Pagination;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@UserLogger
@Controller
@RequestMapping("pay")
public class PayController {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(PayController.class);

    private static final String EMERGENCY_PERMISSION = "xiaoer.emergency";

    /**
     * 检索条件公共服务.
     */
    @Autowired
    private IndexService indexService;

    /**
     * pay记录静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("index")
    public String payIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "pay/index",
            EMERGENCY_PERMISSION
        );
    }

    @RequestMapping("bind/index")
    public String bindIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "pay/bind",
            EMERGENCY_PERMISSION
        );
    }

    @RequestMapping("log")
    @ResponseBody
    Pagination getPayLogList(BaoFooPayLogSearchVO searchVO){

        return null;
    }

    @RequestMapping("repay/log")
    @ResponseBody
    Pagination getRepayLogList(@RequestBody Map map){
        String transId = (String)map.get("transId");

        return null;
    }

    @ResponseBody
    @RequestMapping("bind")
    Pagination getBindInfo(@RequestBody Map map){
        Long uid;
        String bindId;
        try{
            uid = Long.valueOf((Integer)map.get("uid"));
            bindId = (String)map.get("bindId");
            if(bindId.equals("")) {
                bindId = null;
            }
        } catch (Exception ex) {
            LOGGER.error("getBindInfo request parameters error :{}", ex.getMessage());
            return new Pagination<>(1,10,0);
        }
        LOGGER.debug("uid:{}, bindId:{}", uid, bindId);

        return null;
    }
}
