package com.ucamp.model;

import java.sql.Date;

public class EnrollmentVO {
//	lcode, scode, edate, grade
	private String lcode;
	private String scode;
	private Date edate;
	private int grade;
	
	public EnrollmentVO(String lcode, String scode, Date edate, int grade) {
		this.lcode = lcode;
		this.scode = scode;
		this.edate = edate;
		this.grade = grade;
	}
	
	public String getLcode() {
		return lcode;
	}
	public String getScode() {
		return scode;
	}
	public Date getEdate() {
		return edate;
	}
	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "EnrollmentVO [lcode=" + lcode + ", scode=" + scode + ", edate=" + edate + ", grade=" + grade + "]\n";
	}

}
