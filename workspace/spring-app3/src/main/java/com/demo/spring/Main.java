package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("context.xml");
		EmpService service=(EmpService)ctx.getBean("empService");
		System.out.println(service.registerEmp(100, "Shantanu", "Hyd", 40000));

	}

}
