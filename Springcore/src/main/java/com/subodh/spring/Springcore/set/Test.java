package com.subodh.spring.Springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ctx = new ClassPathXmlApplicationContext("com/subodh/spring/Springcore/set/setConfig.xml");
	   CarDealer cars= (CarDealer) ctx.getBean("CarDealer");
	   System.out.println(cars.getName());
	   System.out.println(cars.getModels().getClass());
	   
	
	}

}
