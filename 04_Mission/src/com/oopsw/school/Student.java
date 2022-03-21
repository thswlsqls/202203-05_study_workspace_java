package com.oopsw.school;

public class Student extends Person { // ���
	// 1. ��� ������ private
	private String studentNumber;	// �л���ȣ
	private String studentDept;		// �Ҽ��а�

	// 3. ������ ����
	public Student(String studentNumber, String name, String phoneNumber, String studentDept) {
		//super();
		super(name, phoneNumber);
		setStudentNumber(studentNumber);
		setStudentDept(studentDept);
	}

	// 2. getter, setter ����
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	// 4. ���� �䱸���� ������� �ʿ��� �޼��� ���� -> overriding
	public void print() {
		System.out.print("�л���ȣ : " + studentNumber);
		super.print();
		System.out.println(" �Ҽ��а� : " + studentDept);
	}
	
	@Override
	public String toString() {
			return "�л���ȣ : " + studentNumber+ super.toString() + " �Ҽ��а� : " + studentDept;
	}

}
