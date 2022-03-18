package com.oopsw.school;

public class Teacher extends Person {
	
	public String teacherNumber;
	
	public Teacher(String teacherNumber, String name) {
		super(name);
//		this.teacherNumber = teacherNumber;
		setTeacherNumber(teacherNumber);
	}

	private String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	
	@Override
	public void print() {
		System.out.print("교번 : "+ teacherNumber);
		super.print();
	}
	

}


/**
 * 
 * package com.oopsw.school;

public class Teacher extends Person {

	private String teacherNumber;
	
	public Teacher(String teacherNumber, String name) {
		super(name);
		setTeacherNumber(teacherNumber);
	}

	private void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;		
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}
	@Override
	public void print() {
		System.out.print("교사번호:"+teacherNumber);
		super.print();
	}
}

 * 
 * */

