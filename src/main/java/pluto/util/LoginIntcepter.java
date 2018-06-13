package pluto.util;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import pluto.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginIntcepter implements HandlerInterceptor{
    /*//请求没有处理之前拦截（身份检测）
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //安全认证
        //获得用户的请求url
        String url=request.getRequestURI();//获得用户请求的路径
        if(url.endsWith("login.jsp")||url.endsWith("login.action")||url.endsWith("register.jsp")
                ||url.endsWith("register.action")||url.endsWith("main.action")||url.endsWith("/")){
            return true;
        }
        //已经登录（session里面有user）
        HttpSession session=request.getSession();
        User user=(User)session.getAttribute("user");
        if(user!=null){
            return true;//已经登录不拦截
        }
        //转发到登录页面
        request.getRequestDispatcher("/jsp/login.jsp").forward(request,response);
        return false;

    }
    //请求处理后没有到view被拦截
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }*/
}
