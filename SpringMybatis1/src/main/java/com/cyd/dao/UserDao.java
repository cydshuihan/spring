package com.cyd.dao;

import java.util.List;

import com.cyd.vo.User;

public interface UserDao {
	public List<User> selectAll();
	public User selectUserById(int id);
}
