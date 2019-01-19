package com.cyd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	// 此处会将请求的HttpServletRequest和HttpServletResponse注入进来
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		// 封装要显示到视图中的数据
		mv.addObject("msg", "hello springmvc with annotation");
		// 设置视图名
		mv.setViewName("hello"); // 将会去/WEB-INF/jsp/hello.jsp这个页面
		return mv;
	}
}
