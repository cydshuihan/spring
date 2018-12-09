package com.cyd.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 目标方法执行后通知：后置通知
 * @author cyd
 *
 */
public class AfterLog implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName() + "的方法" + method.getName() + 
				"执行成功，返回值：" + returnValue);
	}

}
