package com.subodh.spring.Springcore.springInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hello() {
		System.out.println("Inside hello method");
	}
	
	public void gototgo() {
		System.out.println("catch you later");
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet()");
        
	}

	@Override
	public void destroy() throws Exception {
        System.out.println("Delete items");		
	}

}
