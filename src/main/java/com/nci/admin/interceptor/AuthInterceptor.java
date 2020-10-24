package com.nci.admin.interceptor;

import com.alibaba.fastjson.JSON;

import com.nci.admin.auth.UserLogger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户信息拦截器.
 * @author Richard Liu (liuyongcheng@test.com)
 * @version $Id$
 * @since 2017.09.15
 */
public final class AuthInterceptor implements HandlerInterceptor {
    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(final HttpServletRequest request,
        final HttpServletResponse response, final Object handler)
        throws Exception {
        final UserLogger userLogger = ((HandlerMethod) handler).getMethod()
            .getDeclaringClass().getAnnotation(UserLogger.class);
        LOGGER.debug("userLogger is {}", userLogger);
        if (userLogger == null) {
            LOGGER.debug("nothing done.");
        } else {
            final String param = JSON.toJSONString(
                request.getParameterMap()
            );


        }
        return true;
    }

    @Override
    public void postHandle(final HttpServletRequest request,
        final HttpServletResponse response, final Object handler,
        final ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(final HttpServletRequest request,
        final HttpServletResponse response, final Object handler,
        final Exception ex) throws Exception {
    }
}
