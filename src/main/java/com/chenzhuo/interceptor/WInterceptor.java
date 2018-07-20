package com.chenzhuo.interceptor;


import com.chenzhuo.util.Defs;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Component
public class WInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        HttpSession session = req.getSession();
        // 请求的uri
        String uri = req.getRequestURI();
        String ctxpath = req.getContextPath();

        if (!ctxpath.endsWith("/")) {
            ctxpath += "/";
        }
        if(ctxpath.equalsIgnoreCase(uri)){
            req.getSession().removeAttribute("language");
            return true;
        }

        // 测试url，以及对外发布的接口url 全部放过
        if (uri.contains("/test")|| uri.contains("/service")) {
            return true;
        }
        //不过滤的配置url
       for (String s : Defs.notFilter) {
            if (uri.indexOf(s) != -1) {
                return true;
            }
        }

        //从session中拿，看看有没有
       /*  DBObject currUser = (BasicDBObject) session.getAttribute(Defs.session_loginUser);

        if (currUser != null) {
            return true;
        }

        res.sendRedirect(ConfUtil.getConf("LOCAL_URL")+"app/index");*/
        System.out.println("进来了呦，just watch it,whether it can be turn filter");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
