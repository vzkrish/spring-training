package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDao {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service=(EmpService)ctx.getBean("empService");
		
		String message=service.registerEmp(203, "Roger", "Bangalore", 45000);
		System.out.println(message);
		
		Emp e=service.serachEmp(100);
		if(e.getEmpId()==0){
			System.out.println("No Emp...");
		}else{
			System.out.println(e.getName());
		}

	}

}
