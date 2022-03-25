package com.oopsw.team2;

public class Person {

	private String name;
	
	public Person(String name) {
		setName(name);
	}
	
	protected void setName(String name) {
		if(name.length() <2 || name.length() > 4)
			throw new RuntimeException("�̸��� 2~4�ڸ� ����");
		this.name=name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "�̸�=" + getName();
	}
	
}
