package com.subodh.spring.Springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	
	public static void main(String[] args) {
	
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/lc/xmlconfig/config.xml");
	Restaurant subodh = (Restaurant) ctx.getBean("restaurant");
    System.out.println(subodh);
    ctx.registerShutdownHook();
	}
}
