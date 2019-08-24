package com.subodh.spring.Springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/list/ListConfig.xml");
		 Restaurant restau = (Restaurant) ctx.getBean("Restaurant");
		 System.out.println(restau.getName());
		 System.out.println(restau.getMenu().getClass());
	
	
	}

}
