package com.subodh.spring.Springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/map/Mapconfig.xml");
		Customer subodh = (Customer) cnt.getBean("customer");
		System.out.println(subodh.getId());
		System.out.println(subodh.getProducts());
		
		
	}

}
