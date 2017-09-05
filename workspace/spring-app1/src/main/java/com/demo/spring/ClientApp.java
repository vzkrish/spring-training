package com.demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Mail mail = (Mail) ctx.getBean("mail");

		
		

		Mail mail1 = (Mail) ctx.getBean("mail");

		System.out.println(mail.getMessage()==mail1.getMessage());
		
		
		System.out.println(mail1==mail);
		
		List<String> addrs=mail.getToAddress();
		System.out.println(addrs.size());
	}

}
