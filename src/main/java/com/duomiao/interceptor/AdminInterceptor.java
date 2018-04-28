package com.duomiao.interceptor;

import com.duomiao.entity.AdminInfo;
import com.duomiao.entity.InternInfo;
import com.duomiao.util.Constant;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class AdminInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       HttpSession session = httpServletRequest.getSession();
       AdminInfo adminInfo = (AdminInfo) session.getAttribute(Constant.SESSION_ADMIN_INFO);
        if(adminInfo!=null){
            return true;
        }
        PrintWriter out = httpServletResponse.getWriter();
        out.print("<script>alert('(Admin)sorry you have not login!');</script>");
        out.close();
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
