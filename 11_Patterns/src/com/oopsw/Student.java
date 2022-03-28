package com.oopsw;

public class Student {

	private String studentId;
	private String name;
	
	public Student(String studentId, String name) {
		super();
		setStudentId(studentId);
		setName(name);
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 2 || name.length() > 4) 
			throw new RuntimeException("이름은 2-4자까지 허용됩니다.");
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}	
	
	
}
