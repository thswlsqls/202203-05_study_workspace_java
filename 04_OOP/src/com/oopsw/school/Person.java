package com.oopsw.school;

/** �л��� ������ ���� ��ü */
public class Person { // extends Object
	//1. �Ϲ������� ��� �����ʹ� private
	private String name;
	
	//3. ������ - �ʱ�ȭ
	public Person() {} // ������ ��쿡 ���� ������ ���� ���θ� �Ǵ���. �Ϲ������� default constructor ������
	public Person(String name) {
//		super(); // ������ ������. ������ �޸� �������� �����ؾ� ��.
//		this.name = name; 
		setName(name); // �����ڴ� �޼��带 �ƹ����� ȣ�� ����, �޼���� �����ڸ� ���������θ� ȣ���� 
	}
	
	//2. 1)�� ���� set, get �޼���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//4. ���� ������� �ʿ��� �޼��带 ������.
	public void print() {
		System.out.println("name : "+name);
	}

	// ��� Ŭ������ ���� �θ�� Object��
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
//�л��� ������ ���� ��ü
public class Person {  //extends Object
	//1. �Ϲ������� ��� �����ʹ� private
	private String name;

	//3. ������ - �ʱ�ȭ
	public Person() {}  //������ ������ ���� ������ ���� ���� �Ǵ�, �Ϲ������� default constructor ����
	public Person(String name) {
		//super();
		setName(name);   //�����ڴ� �޼��带 �ƹ����� ȣ�� ����, �޼���� �����ڸ� ���������θ� ȣ��
	}
	
	//2. 1)�� ���� set, get �޼��� (�Ϲ������δ� public)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//4 ���� �䱸������ ������� �ʿ��� �޼��带 ����
	public void print() {
		System.out.println("name : "+ name);
	}
	
	
	//��� Ŭ������ ���� �θ� - Object
	@Override
	public String toString() {
		return " name=" + name ;
	}
}

*/