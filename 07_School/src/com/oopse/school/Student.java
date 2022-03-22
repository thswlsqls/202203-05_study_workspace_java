package com.oopse.school;

public class Student extends Person{

	private String studentNumber;

	public Student(String studentNumber, String name) {
		super(name);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "학번=" + studentNumber + ", " + super.toString();
	}

}


//package com.oopsw.school;
////B)
//public class Student extends Person{
//	private String studentNumber;
//
//	public Student(String studentNumber, String name) {
//		super(name);
//		setStudentNumber(studentNumber);
//	}
//
//	public String getStudentNumber() {
//		return studentNumber;
//	}
//
//	public void setStudentNumber(String studentNumber) {
//		this.studentNumber = studentNumber;
//	}
//	
//	@Override
//	public String toString() {
//		return "학번 = "+studentNumber+", "+ super.toString();
//	}
//	
//}
