package com.subodh.spring.Springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/constructorInjection/config.xml");
	Employee e = (Employee) ctx.getBean("Employee");
	System.out.println(e);
	}
}
