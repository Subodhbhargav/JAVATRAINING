package com.subodh.spring.Springcore.constructorInjection.ambiguity;

public class Addition {
	
	Addition(double a, double b){
		System.out.println("inside 2nd constructor");
	}
	
	Addition(int a, int b){
		System.out.println("inside 1st constructor");
	}
	
	Addition(String a, String b){
		System.out.println("inside 2nd constructor");
	}
	


}
