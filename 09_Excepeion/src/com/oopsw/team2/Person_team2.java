package com.oopsw.team2;

public class Person_team2 {

	private String name;
	private String country;
	
	public Person_team2(String name, String country) {
		setName(name);
		setCountry(country);
	}

	protected void setName(String name) {
		if(name.length() > 50)
//			throw new RuntimeException("�̸��� 50�� ���ϸ� ����");
			throw new NameLengthException("�̸��� �ִ� 50�ڱ��� �����մϴ�.");
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
		return "�̸�=" + name + ", ����=" + country;
	}	
	
}
