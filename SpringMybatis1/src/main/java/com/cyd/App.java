package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.dao.UserDao;

/**
 * spring整合mybatis
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        System.out.println(userDao.selectAll());
        System.out.println(userDao.selectUserById(1));
    }
}
