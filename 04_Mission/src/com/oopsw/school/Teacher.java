package com.oopsw.school;

public class Teacher extends Person { // 상속
	// 1. 멤버 데이터 private
	private String teacherNumber;	// 교사번호
	private String teacherSubject;	// 담당과목

	// 3. 생성자 정의
	public Teacher(String teacherNumber, String name, String phoneNumber, String teacherSubject) {
		super(name, phoneNumber);
		setTeacherNumber(teacherNumber);
		setTeacherSubject(teacherSubject);
	}

	// 2. getter, setter 생성
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

	// 4. 업무 요구사항 기반으로 필요한 메서드 정의 -> overriding
	public void print() {
		System.out.print("교사번호 : " + teacherNumber);
		super.print();
		System.out.println(" 담당과목 : " + teacherSubject);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "교사번호 : " + teacherNumber + super.toString() +" 담당과목 : " + teacherSubject;
	}
}
