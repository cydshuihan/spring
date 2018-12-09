package com.cyd.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 目标方法执行前执行：前置通知
 * 
 * @author cyd
 *
 */
public class Log implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName() + "的方法" + method.getName() + "开始执行");
	}

}
