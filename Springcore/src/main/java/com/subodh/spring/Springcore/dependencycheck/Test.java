package com.subodh.spring.Springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/dependencycheck/config.xml");
		Order order = (Order) ctx.getBean("order");
		System.out.println(order);
		
		
		
	}

}
