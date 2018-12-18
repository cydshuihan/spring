package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.dao.UserDao;

/**
 * spring整合mybatis方式二：在spring配置文件中，不需要管理sqlSessionTemplate，
 * 在Dao的实现中，需要继承SqlSessionDaoSupport
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        System.out.println(userDao.selectAll());
    }
}
