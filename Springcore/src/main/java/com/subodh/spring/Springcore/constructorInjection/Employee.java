package com.subodh.spring.Springcore.constructorInjection;


public class Employee {
	
	private int Eid;
	private Address address;

	
	
	public Employee(int eid, Address address) {
		
		this.Eid = eid;
		this.address = address;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", address=" + address + "]";
	}

}
