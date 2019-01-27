package com.cyd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cyd.vo.User;

@Controller
public class UserController {
	@RequestMapping("/login")
	public String login(User user, HttpSession session) {
		if("test".equals(user.getName()) && "123456".equals(user.getPwd())) {
			session.setAttribute("user", user);
			return "redirect:/index.jsp";
		}
		return "redirect:/login.jsp";
	}
}
