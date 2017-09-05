package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service = (EmpService) ctx.getBean("empService");
		System.out.println(service.registerEmp(100, "Shantanu", "Hyd", 40000));

	}

}
