package com.cyd.service.impl;

import com.cyd.service.UserService;

public class UserServiceImpl implements UserService {

	public void add() {
		System.out.println("添加成功");
	}

	public void update() {
		System.out.println("更新成功");
	}

	public void delete() {
		System.out.println("删除成功");
		throw new RuntimeException("测试后置通知能否被调用");
	}

	public void query() {
		System.out.println("查找成功");
	}

}
