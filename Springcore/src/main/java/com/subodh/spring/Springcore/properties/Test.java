package com.subodh.spring.Springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext cnt = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/properties/Propertiesconfig.xml");
	    Languages subodh = (Languages) cnt.getBean("CandL");
		System.out.println(subodh.getCandL());
		
		
		
		
		
	}

}
