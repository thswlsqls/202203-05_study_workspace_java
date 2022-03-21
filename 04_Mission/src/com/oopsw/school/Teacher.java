package com.oopsw.school;

public class Teacher extends Person { // ���
	// 1. ��� ������ private
	private String teacherNumber;	// �����ȣ
	private String teacherSubject;	// ������

	// 3. ������ ����
	public Teacher(String teacherNumber, String name, String phoneNumber, String teacherSubject) {
		super(name, phoneNumber);
		setTeacherNumber(teacherNumber);
		setTeacherSubject(teacherSubject);
	}

	// 2. getter, setter ����
	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	// 4. ���� �䱸���� ������� �ʿ��� �޼��� ���� -> overriding
	public void print() {
		System.out.print("�����ȣ : " + teacherNumber);
		super.print();
		System.out.println(" ������ : " + teacherSubject);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�����ȣ : " + teacherNumber + super.toString() +" ������ : " + teacherSubject;
	}
}
