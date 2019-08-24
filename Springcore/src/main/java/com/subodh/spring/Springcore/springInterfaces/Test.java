package com.subodh.spring.Springcore.springInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	
	public static void main(String[] args) {
	
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/springInterfaces/config.xml");
	Manager subodh = (Manager) ctx.getBean("manager");
    System.out.println(subodh);
    ctx.registerShutdownHook();
	}
}
