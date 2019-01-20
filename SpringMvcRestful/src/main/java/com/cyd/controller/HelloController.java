package com.cyd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cyd.vo.User;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String helloModelMap(@RequestParam("name")String name, ModelMap modelMap) {
		//以下这句相等于request.setAttribute("name",name)
		modelMap.addAttribute("name", name);
		System.out.println(name);
		return "index.jsp";
	}
	@RequestMapping("/delete/{id}")
	public String helloModelMap(@PathVariable int id) {
		System.out.println(id);
		return "/index.jsp"; // 直接写index.jsp会把请求转发到/delete/index.jsp，提示未找到
	}
}
