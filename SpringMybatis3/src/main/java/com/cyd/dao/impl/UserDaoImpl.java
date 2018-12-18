package com.cyd.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cyd.dao.UserDao;
import com.cyd.vo.User;
/**
 * 继承SqlSessionDaoSupport来整合mybatis
 * @author cyd
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	@Override
	public List<User> selectAll() {
		return this.getSqlSession().selectList("com.cyd.vo.user.mapper.selectAll");
	}


	
	
	
}
