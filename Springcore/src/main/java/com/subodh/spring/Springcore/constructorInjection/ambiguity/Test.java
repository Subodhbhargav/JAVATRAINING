package com.subodh.spring.Springcore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/constructorInjection/ambiguity/config.xml");
		Addition addd = (Addition) ctx.getBean("addition");
		System.out.println(addd);
	}

}
