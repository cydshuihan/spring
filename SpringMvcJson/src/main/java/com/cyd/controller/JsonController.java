package com.cyd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyd.vo.User;

@Controller
public class JsonController {
	@RequestMapping("/json")
	@ResponseBody
	public List<User> json() {
		List<User> userList = new ArrayList<>();
		userList.add(new User(1,"张三", "男"));
		userList.add(new User(2,"Jack", "男"));
		userList.add(new User(3,"Lily", "female"));
		return userList;
	}
}
