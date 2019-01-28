package com.cyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyd.dao.UserDao;
import com.cyd.service.UserService;
import com.cyd.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}
