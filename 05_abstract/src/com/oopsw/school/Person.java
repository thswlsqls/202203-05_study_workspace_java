package com.oopsw.school;

import java.util.ArrayList;

// 전화번호, 이름
public class Person {
	
	String phone;
	String name;
	
	public Person() {
		super();
	}

	public Person(String phone, String name) {
		super();
		this.phone = phone;
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "phone=" + phone + ", name=" + name ;
	}
	
}
