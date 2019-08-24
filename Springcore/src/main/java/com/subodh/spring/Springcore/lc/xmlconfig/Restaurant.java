package com.subodh.spring.Springcore.lc.xmlconfig;

public class Restaurant {
	
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
	
	

}
