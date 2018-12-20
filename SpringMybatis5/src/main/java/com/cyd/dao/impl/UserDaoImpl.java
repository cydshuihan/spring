package com.cyd.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.cyd.dao.UserDao;
import com.cyd.vo.User;
/**
 * 继承SqlSessionDaoSupport来整合mybatis
 * @author cyd
 *
 */
public class UserDaoImpl  implements UserDao{
	private SqlSessionTemplate sqlSession; // spring与mabatis整合对象，不需要自己创建sqlsession了
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<User> selectAll() {
		return sqlSession.selectList("com.cyd.vo.user.mapper.selectAll");
	}
	
}
