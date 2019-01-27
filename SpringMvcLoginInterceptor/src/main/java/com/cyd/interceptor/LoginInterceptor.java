package com.cyd.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	// 允许哪些url不被拦截，哪些url需要被拦截
	private List<String> allowedPassUrl;
	public void setAllowedPassUrl(List<String> allowedPassUrl) {
		this.allowedPassUrl = allowedPassUrl;
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURL().toString();
		System.out.println("request url:" + url);
		//先判断session是否有
		Object user = request.getSession().getAttribute("user");
		if(user != null) {
			System.out.println("session不为空,id:" + request.getSession().getId());
			return true;
		} else {
			System.out.println("session为空");
		}
		for(String temp : allowedPassUrl) {
			if(url.endsWith(temp)) {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath() + "/login.jsp");
		return false;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
