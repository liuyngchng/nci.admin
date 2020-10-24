package com.nci.admin.controller;


import com.nci.admin.auth.UserLogger;
import com.nci.admin.model.Pagination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

@UserLogger
@Controller
@RequestMapping("w")
public class WController {
    private static final Logger LOGGER =
        LoggerFactory.getLogger(WController.class);

    @ResponseBody
    @RequestMapping("coupon/info")
    public Pagination getCouponInfo(@RequestBody Map requestMap) {
        Map<String,String> map = this.getCouponItem(requestMap);
        List<Map.Entry<String,String>> entryList = new ArrayList<>();
        for(Map.Entry<String,String> entry : map.entrySet()) {
            entryList.add(entry);
        }
        Pagination<Map.Entry<String,String>> page = new Pagination<>(1,10,0);
        page.setRows(entryList);
        page.setTotal(entryList.size());
        return page;
    }
    private Map<String,String> getCouponItem(Map requestMap){
        Map<String,String> map = new TreeMap<>();

        return map;
    }
}
