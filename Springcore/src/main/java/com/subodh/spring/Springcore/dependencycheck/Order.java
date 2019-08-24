package com.subodh.spring.Springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Order {

	

	private int cid;
	private String cName;
	private List<String> items;

	public int getCid() {
		return cid;
	}
	@Required
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [cid=" + cid + ", cName=" + cName + ", items=" + items + "]";
	}
	
	

}
