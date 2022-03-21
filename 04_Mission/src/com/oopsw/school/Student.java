package com.oopsw.school;

public class Student extends Person { // 상속
	// 1. 멤버 데이터 private
	private String studentNumber;	// 학생번호
	private String studentDept;		// 소속학과

	// 3. 생성자 정의
	public Student(String studentNumber, String name, String phoneNumber, String studentDept) {
		//super();
		super(name, phoneNumber);
		setStudentNumber(studentNumber);
		setStudentDept(studentDept);
	}

	// 2. getter, setter 생성
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

	// 4. 업무 요구사항 기반으로 필요한 메서드 정의 -> overriding
	public void print() {
		System.out.print("학생번호 : " + studentNumber);
		super.print();
		System.out.println(" 소속학과 : " + studentDept);
	}
	
	@Override
	public String toString() {
			return "학생번호 : " + studentNumber+ super.toString() + " 소속학과 : " + studentDept;
	}

}
