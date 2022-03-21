package com.oopsw.school;

public class Person {
	// 1. 멤버 데이터 private
	private String name;		// 이름
	private String phoneNumber; // 전화번호
	
	// 3. 생성자 정의
	public Person(String name, String phoneNumber) {
		// super();
		setName(name);
		setPhoneNumber(phoneNumber);
	}
	
	// 2. getter, setter 생성
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

	// 4. 업무 요구사항 기반으로 필요한 메서드 정의
	public void print() {
		System.out.print(" 이름 : " + name + " 전화번호 : " + phoneNumber);
	}
	
	@Override
	public String toString() {
		return " 이름 : " + name + " 전화번호 : " + phoneNumber;
	}

}
