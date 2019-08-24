package com.subodh.spring.Springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	
	public static void main(String[] args) {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/reftype/config.xml");
	Student subodh = (Student) ctx.getBean("student");
    System.out.println(subodh);
	}
}
