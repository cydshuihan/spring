package com.cyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cyd.vo.User;

@Controller
public class HelloController {
	// 单例模式，只初始化一次，请求多次不会再次初始化HelloController
	public HelloController() {
		System.out.println("HelloController construct");
	}
	
	@RequestMapping("/hello")
	public String hello(String name) {
		System.out.println(name);
		return "hello";
	}
	// 请求参数名和方法参数名不一致情况处理
	@RequestMapping("/hello2")
	public String hello2(@RequestParam("uname")String name) {
		System.out.println(name);
		return "hello";
	}
	@RequestMapping("/user")
	public String user(User user) {
		System.out.println(user);
		return "hello";
	}
	
	// 使用ModelMap显示数据到前端UI，ModelMap必须作为处理方法的参数传入，不能在方法内部new一个
	@RequestMapping("/modelMap")
	public String helloModelMap(@RequestParam("uname")String name, ModelMap modelMap) {
		//以下这句相等于request.setAttribute("name",name)
		modelMap.addAttribute("name", name);
		System.out.println(name);
//		return "index.jsp";
		//此处因为mvc.xml配置了视图解析器，故不能直接如上返回，修改如下：
		return "index";
	}
}
