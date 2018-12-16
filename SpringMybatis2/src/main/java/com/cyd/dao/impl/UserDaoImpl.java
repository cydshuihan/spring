package com.cyd.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.cyd.dao.UserDao;
import com.cyd.vo.User;

public class UserDaoImpl implements UserDao{
	private SqlSessionTemplate sqlSession; // spring与mabatis整合对象，不需要自己创建sqlsession了
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<User> selectAll() {
		// 缺少事务管理，执行第一个添加操作，事务就提交了。本来应该三个都成功才算成功，现在删除失败，但是确成功插入一条数据，不符合实际要求
		User user = new User();
		user.setName("陈六");
		user.setPwd("123438");
		this.add(user);
		this.remove(10);
		return sqlSession.selectList("com.cyd.vo.user.mapper.selectAll");
	}

	@Override
	public User selectUserById(int id) {
		return sqlSession.selectOne("com.cyd.vo.user.mapper.selectUserById", id);
	}
	@Override
	public int add(User user) {
		return sqlSession.insert("com.cyd.vo.user.mapper.addUser", user);
	}
	@Override
	public int remove(int id) {
		return sqlSession.delete("com.cyd.vo.user.mapper.deleteUser", id);
	}

	
	
	
}
