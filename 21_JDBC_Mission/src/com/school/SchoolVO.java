package com.school;

public class SchoolVO {
	
	private String pname;
	private String department;
	private String sname;
	private float grade;
	
	public SchoolVO(String pname, String department, String sname, float grade) {
		super();
		setPname(pname);
		setDepartment(department);
		setSname(sname);
		setGrade(grade);
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "SchoolVO [pname=" + pname + ", department=" + department + ", sname=" + sname + ", grade=" + grade
				+ "]\n";
	}
	
	

}
