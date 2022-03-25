package com.oopsw.team2;

public class Person_refactor_1 extends Person{

	private String name;
	private String country;
	
	public Person_refactor_1(String name, String country) {
		super("테스트");
		setName(name);
		setCountry(country);
	}
	
	protected void setName(String name) {
		if(name.length() > 50)
			throw new RuntimeException("이름은 50자 이하만 가능");
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 국적=" + country;
	}
	
}
