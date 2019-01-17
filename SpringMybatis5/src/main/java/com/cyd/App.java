package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.dao.UserDao;

/**
 * spring整合mybatis方式四：不需要mybatis.cfg.xml配置文件，将所有的配置信息配置在spring的配置文件beans.xml中的
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
