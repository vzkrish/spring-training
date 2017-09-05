package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoLogger {

	@Pointcut("execution(* com.demo.spring.Hello.sayHello(..))")
	private void pcut(){}
	
	@Before("pcut()")
	public void logBefore() {
		System.out.println("Before logging....");
	}

	@AfterReturning("pcut()")
	public void logAfter() {
		System.out.println("After logging....");
	}
}
