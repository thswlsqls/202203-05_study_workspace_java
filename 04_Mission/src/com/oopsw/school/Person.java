package com.oopsw.school;

public class Person {
	// 1. ��� ������ private
	private String name;		// �̸�
	private String phoneNumber; // ��ȭ��ȣ
	
	// 3. ������ ����
	public Person(String name, String phoneNumber) {
		// super();
		setName(name);
		setPhoneNumber(phoneNumber);
	}
	
	// 2. getter, setter ����
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// 4. ���� �䱸���� ������� �ʿ��� �޼��� ����
	public void print() {
		System.out.print(" �̸� : " + name + " ��ȭ��ȣ : " + phoneNumber);
	}
	
	@Override
	public String toString() {
		return " �̸� : " + name + " ��ȭ��ȣ : " + phoneNumber;
	}

}
