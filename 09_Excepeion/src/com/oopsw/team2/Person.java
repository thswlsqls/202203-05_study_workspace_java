package com.oopsw.team2;

public class Person {

	private String name;
	
	public Person(String name) {
		setName(name);
	}
	
	protected void setName(String name) {
		if(name.length() <2 || name.length() > 4)
			throw new RuntimeException("이름은 2~4자만 가능");
		this.name=name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "이름=" + getName();
	}
	
}
