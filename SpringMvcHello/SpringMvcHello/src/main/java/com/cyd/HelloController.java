package com.cyd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		// 封装要显示到视图中的数据
		mv.addObject("msg", "hello springmvc");
		// 设置视图名
		mv.setViewName("hello"); // 将会去/WEB-INF/jsp/hello.jsp这个页面
		return mv;
	}

}
