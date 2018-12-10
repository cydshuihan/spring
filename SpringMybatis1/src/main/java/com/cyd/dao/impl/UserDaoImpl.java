package com.cyd.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.cyd.dao.UserDao;
import com.cyd.vo.User;

public class UserDaoImpl implements UserDao{
	private SqlSessionTemplate sqlSession; // spring与mabatis整合对象，不需要自己创建sqlsession了
	
	@Override
	public List<User> selectAll() {
		return sqlSession.selectList("com.cyd.vo.user.mapper.selectAll");
	}

	@Override
	public User selectUserById(int id) {
		return sqlSession.selectOne("com.cyd.vo.user.mapper.selectUserById", id);
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
}
