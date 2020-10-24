package com.nci.admin.controller;


import com.nci.admin.auth.UserLogger;
import com.nci.admin.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Ufile文件浏览.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.09.10
 */
@UserLogger
@Controller
@RequestMapping("f")
public class UfileController {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(UfileController.class);

    /**
     * Constant.
     */
    private static final String EMERGENCY_PERMISSION = "d.emergency";


    @Autowired
    private IndexService indexService;

    @RequestMapping("picture/index")
    public String picIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "ufile/picIndex",
            EMERGENCY_PERMISSION
        );
    }

    @RequestMapping("picture/url")
    @ResponseBody
    public String getPicUrl(String key) {
        final String result = "";
        LOGGER.info("result get from pictureService.getUrl({}, 500) is {}", key, result);
        return String.format("{\"data\":\"%s\",\"errCode\":0}", result);
    }


    @RequestMapping("pdf/index")
    public String pdfIndex(final HttpServletRequest request) {
        return this.indexService.showIndexPage(
            request,
            "ufile/pdfIndex",
            EMERGENCY_PERMISSION
        );
    }

    @RequestMapping("pdf/url")
    @ResponseBody
    public String getPdfUrl(final String loanId) {

        String result;
        return null;
    }
}
