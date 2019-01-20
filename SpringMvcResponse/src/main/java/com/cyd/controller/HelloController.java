package com.cyd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	// 通过Servlet API对象将结果显示在ui上
	@RequestMapping("/hello")
	public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		response.getWriter().println("hello spring mvc use servlet api");
		// 注意，WEB-INF里面的文件外部访问不了，所以访问jsp/hello.jsp是找不到对应文件的。
//		response.sendRedirect("hello.jsp"); 
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}
	
	// 转发的实现1
	@RequestMapping("/hello1")
	public String hello1() {
		return "hello.jsp";
	}

	// 转发的实现2
	@RequestMapping("/hello2")
	public String hello2() {
		return "forward:hello.jsp";
	}

	// 重定向
	@RequestMapping("/hello3")
	public String hello3() {
		return "redirect:hello.jsp";
	}

	// 带视图器转发
	@RequestMapping("/hello4")
	public String hello4() {
		return "hello";
	}

}
