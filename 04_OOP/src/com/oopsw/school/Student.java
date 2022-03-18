package com.oopsw.school;

public class Student extends Person { // ������ �ڵ尡 ������ ������ ��Ӻ��� ��
	// A2 - ��� ���� ��� ������ ���� ����� �߰���
	private String studentNumber;

	// A3 - �����ڴ� ��� ��� �����͸� �ʱ�ȭ�� �� �ִ�. -> �ڵ������� �� ���ϸ� ���� ������.
	public Student(String studentNumber, String name) {
		super(name); // �ļ��ڿ��� �ٸ� �����ڸ� ȣ�� 1���� ������ - ������ �⺻ �����ڶ� ȣ��(VM)
	//	this.studentNumber = studentNumber;
		setStudentNumber(studentNumber);
	}

	// A4 
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	//A5 - ��ӹ��� ��� �߿��� �����ΰ� ���� �ȵ�� �� ������ ���� ���� ==> overriding
	@Override
	public void print() {
		System.out.print("�й� : "+ studentNumber);
		super.print(); // �θ��� �޼��带 �߰��� ����ϰ� ������ ȣ����. 
	}

	@Override
	public String toString() {
//		return "Student [studentNumber=" + studentNumber + "]";
		return "�й�: " + studentNumber + super.toString();
	}
	
	
	
}


/**
package com.oopsw.school;

public class Student extends Person{  //A1
	//A2 - ��ӹ��� ��� ������ ���� ����� �߰�
	private String studentNumber;

	//A3 - �����ڴ� ��� ��� �����͸� �ʱ�ȭ �� �� �ִ�. = �ڵ������Ҷ� ���ϸ� ���� ����
	public Student(String studentNumber, String name) {
		super(name);  //�����ڿ��� �ٸ� �����ڸ� ȣ�� 1���� ����-������ �⺻ �����ڶ� ȣ��(VM)
		setStudentNumber(studentNumber);
	}
	//A4	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	//A5 - (���)���� ��� �߿��� (�����ΰ� ���� �ȵ�°�) ������ ���� ���� ==> overriding ==> ���뿡 ���� ���������� ���� �ڵ�
	@Override
	public void print() {
		System.out.print("�й� : "+ studentNumber);
		super.print();  //�θ��� �޼��带 �߰��� ����ϰ� ������ ȣ��
	}
	@Override
	public String toString() {
		return "�й� : "+ studentNumber+ super.toString();
	}

}

 */