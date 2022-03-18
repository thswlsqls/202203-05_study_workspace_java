package com.oopsw.school;

/** 학생과 교사의 공통 객체 */
public class Person { // extends Object
	//1. 일반적으로 멤버 데이터는 private
	private String name;
	
	//3. 생성자 - 초기화
	public Person() {} // 원래는 경우에 따라 생성자 저의 여부를 판단함. 일반적으로 default constructor 정의함
	public Person(String name) {
//		super(); // 생략이 가능함. 이유는 메모리 관점에서 설명해야 함.
//		this.name = name; 
		setName(name); // 생성자는 메서드를 아무때나 호출 가능, 메서드는 생성자를 개인적으로만 호출함 
	}
	
	//2. 1)을 보고 set, get 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//4. 업무 기반으로 필요한 메서드를 정의함.
	public void print() {
		System.out.println("name : "+name);
	}

	// 모든 클래스의 공통 부모는 Object임
	@Override
	public String toString() {
//		return "Person [name=" + name + "]";
		return "name=" + name;
	}
		
	
}

/**
 * 
 * 
package com.oopsw.school;
//학생과 교사의 공통 객체
public class Person {  //extends Object
	//1. 일반적으로 멤버 데이터는 private
	private String name;

	//3. 생성자 - 초기화
	public Person() {}  //원래는 업무에 따라 생성자 정의 여부 판단, 일반적으로 default constructor 정의
	public Person(String name) {
		//super();
		setName(name);   //생성자는 메서드를 아무때나 호출 가능, 메서드는 생성자를 제한적으로만 호출
	}
	
	//2. 1)을 보고 set, get 메서드 (일반적으로는 public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//4 업무 요구사항을 기반으로 필요한 메서드를 정의
	public void print() {
		System.out.println("name : "+ name);
	}
	
	
	//모든 클래스의 공통 부모 - Object
	@Override
	public String toString() {
		return " name=" + name ;
	}
}

*/