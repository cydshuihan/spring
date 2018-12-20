package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.dao.UserDao;

/**
 * spring整合mybatis方式四：去掉mybatis.cfg.xml配置文件，只配置beans.xml中的
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
