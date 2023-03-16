package cn.xj.Interceptor;

import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements AsyncHandlerInterceptor {
    @Override
    //在handler执行之前进行处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.判断用户是否登录
        //从cookie中取token
        
        //根据token换取用户信息，调用SSO系统的接口
        //取不到用户信息，跳转到登录页面，把用户请求的url作为参数传递给登录界面。
        //返回false
        //取到用户信息，放行。
        //返回值决定此handler是否执行
        return true;
    }
    //在handler执行之后，返回modelandview之前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    //返回modelandview之后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
