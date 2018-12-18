package com.cyd.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cyd.dao.UserDao;
import com.cyd.dao.UserMapper;
import com.cyd.vo.User;
/**
 * 继承SqlSessionDaoSupport来整合mybatis
 * @author cyd
 *
 */
public class UserDaoImpl  implements UserDao{
	private UserMapper userMapper;
	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
}
