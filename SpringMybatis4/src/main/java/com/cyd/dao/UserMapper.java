package com.cyd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cyd.vo.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> selectAll();
}
