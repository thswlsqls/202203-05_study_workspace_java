package com.oopsw.school;
// �����ȣ, �����, ��ȭ��ȣ, �̸�
public class Teacher extends Person{

	String teacherNumber;
	String subjectName;
	
	public Teacher() {
		super();
	}
	public Teacher(String teacherNumber, String phone) {
		this(teacherNumber, phone, null, null);
	}
	public Teacher(String teacherNumber, String phone, String name, String subjectName) {
		super(phone, name);
		this.teacherNumber = teacherNumber;
		this.subjectName = subjectName;
	}
	
	public String getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "teacherNumber=" + teacherNumber + ", subjectName=" + subjectName + ", " + super.toString();
	}
	
	
}
