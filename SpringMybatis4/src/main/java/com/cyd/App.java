package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.dao.UserDao;

/**
 * spring整合mybatis方式三：使用注解，去掉mapper.xml文件，改为mapper接口
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
