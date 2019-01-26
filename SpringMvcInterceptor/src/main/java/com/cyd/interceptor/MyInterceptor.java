package com.cyd.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor{
	// 在请求处理的方法之前执行，如果返回true，执行下一个拦截器，如果返回false，不执行下一个拦截器。
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("==========拦截器处理前============");
		return true;
	}
	// 在请求处理的方法执行之后执行
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("==========拦截器处理后============");
	}
	// 在DispatcherServlet处理后执行，一般用于做清理工作
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("==========controller处理器执行后============");
	}

}
