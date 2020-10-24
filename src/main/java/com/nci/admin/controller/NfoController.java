package com.nci.admin.controller;

import com.nci.admin.auth.UserLogger;
import com.nci.admin.service.IndexService;
import com.nci.admin.model.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户sky信息查询..
 */
@UserLogger
@Controller
@RequestMapping("i")
public class NfoController {

    /**
     * 检索条件公共服务.
     */
    @Autowired
    private IndexService indexService;


    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "d.emergency";

    /**
     * whoAm信息静态页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("idCard/Am")
    public String idCardAmIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "idCard/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 获取whoAm信息.
     * @param request A {@link HttpServletRequest} instance.
     * @return A {@link Pagination} instance.
     */
    @RequestMapping("idCard/Am/data")
    @ResponseBody
    public Pagination getIdCardAmInfo(final HttpServletRequest request) {
        return null;
    }


    /**
     * 删除whoAm信息.
     * @param request A {@link HttpServletRequest} instance.
     * @return A {@link Pagination} instance.
     */
    @RequestMapping("idCard/Am/delete")
    @ResponseBody
    public boolean deleteIdCardAmInfo(final HttpServletRequest request) {
        return false;
    }

    /**
     * 活体首页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("face/living")
    public String faceLivingIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "faceLiving/index",
            EMERGENCY_PERMISSION
        );
    }

    @RequestMapping("face/living/data")
    @ResponseBody
    public Pagination getFaceLivingInfo(final HttpServletRequest request) {
        return null;
    }


    /**
     * create信息.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("auth/item")
    public String authItemIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "authItem/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * create信息数据.
     * @param request A {@link HttpServletRequest} instance.
     * @return A {@link Pagination} instance.
     */
    @RequestMapping("auth/item/data")
    @ResponseBody
    public Pagination getAuthItemInfo(final HttpServletRequest request) {
        return null;
    }

    /**
     * 授权数据首页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("user/info")
    public String userInfoIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "userInfo/index",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 获取授权数据.
     * @param request A {@link HttpServletRequest} instance.
     * @return A {@link Pagination} instance.
     */
    @RequestMapping("user/info/data")
    @ResponseBody
    public Pagination getUserInfo(final HttpServletRequest request) {
        return null;
    }

    /**
     * 授权数据首页.
     * @param request A {@link HttpServletRequest} instance.
     * @return A string result.
     */
    @RequestMapping("credit/amount")
    public String creditAmountIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "credit/amount",
            EMERGENCY_PERMISSION
        );
    }

    /**
     * 获取授权数据.
     * @param request A {@link HttpServletRequest} instance.
     * @return A {@link Pagination} instance.
     */
    @RequestMapping("credit/amount/data")
    @ResponseBody
    public Pagination getCreditAmount(final HttpServletRequest request) {
        return null;
    }
}
