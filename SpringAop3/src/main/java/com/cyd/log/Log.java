package com.cyd.log;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 第三种方式：使用注解实现aop
 * 
 * @author cyd
 *
 */
@Aspect
public class Log {
	// 前置通知
	@Before(value="execution(* com.cyd.service.impl.*.*(..))")  // 设置切点
	public void before() {
		System.out.println("=========方法执行前============");
	}
	// 后置通知
	@After("execution(* com.cyd.service.impl.*.*(..))")
	public void after() {
		System.out.println("=========方法执行后============");
	}
	// 环绕通知
	@Around("execution(* com.cyd.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("环绕前");
		Object result = pj.proceed(); // 执行目标方法
		System.out.println("环绕后");
		return result;
	}

}
