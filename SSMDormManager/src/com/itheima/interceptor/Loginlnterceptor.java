// 
// 
// 

package com.itheima.interceptor;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import com.itheima.po.Admin;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;

public class Loginlnterceptor implements HandlerInterceptor
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        final String url = request.getRequestURI();
        if (url.indexOf("/login") >= 0) {
            return true;
        }
        final HttpSession session = request.getSession();
        final Admin admin = (Admin)session.getAttribute("admin");
        if (admin != null) {
            return true;
        }
        request.setAttribute("msga", (Object)"\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55\uff0c\u8bf7\u5148\u767b\u5f55\uff01");
        request.getRequestDispatcher("/shopping homepage.jsp").forward((ServletRequest)request, (ServletResponse)response);
        return false;
    }
    
    public void postHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final ModelAndView modelAndView) throws Exception {
    }
    
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final Exception ex) throws Exception {
    }
}
