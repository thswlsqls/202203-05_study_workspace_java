package com.school;

import java.util.Date;

public class EnrollmentVO {
	private String lcode;
	private String scode;
	private Date edate;
	private int grade;
	
	public EnrollmentVO(String lcode, String scode) {
		this(lcode, scode, null, 0);
	}

	public EnrollmentVO(String lcode, String scode, Date edate) {
		this(lcode, scode, edate, 0);
	}

	public EnrollmentVO(String lcode, String scode, Date edate, int grade) {
		super();
		setLcode(lcode);
		setScode(scode);
		setEdate(edate);
		setGrade(grade);
	}
	
	
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "EnrollmentVO [lcode=" + lcode + ", scode=" + scode + ", edate=" + edate + ", grade=" + grade + "]\n";
	}	
}
