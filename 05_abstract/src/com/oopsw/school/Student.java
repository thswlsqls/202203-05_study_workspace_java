package com.oopsw.school;
// 힉번, 전화번호, 이름
public class Student extends Person{

	String studentNumber;

	public Student(String studentNumber, String phone) {
		this(studentNumber, phone, null);
	}

	public Student(String studentNumber, String phone, String name) {
		super(phone, name);
//		this.studentNumber = studentNumber;
		setStudentNumber(studentNumber);
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "studentNumber=" + studentNumber +", " + super.toString();
	}
	
}
