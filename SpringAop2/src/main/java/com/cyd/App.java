package com.cyd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyd.service.UserService;

/**
 * 方式二：自定义类实现aop
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService)ac.getBean("userService");
        userService.add();
    }
}
