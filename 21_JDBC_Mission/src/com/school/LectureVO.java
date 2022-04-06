package com.school;

public class LectureVO {
	private String lcode;
	private String lname;
	private int hours;
//	private String room;
	private String instructor;
//	private int capacity;
//	private int persons;
	
	public LectureVO(String lcode, String lname, int hours, String instructor) {
		setLcode(lcode);
		setLname(lname);
		setHours(hours);
		setInstructor(instructor);
	}
	
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public String toString() {
		return "LectureVO [lcode=" + lcode + ", lname=" + lname + ", hours=" + hours + ", instructor=" + instructor
				+ "]\n";
	}
	
}
