package JavaMission04;

public class Student extends Person {
	
	private String studentId;
	private String departmentId;
	
	public Student() {};
	public Student(String studentId, String name, String phone, String departmentId) {
		super(name, phone);
		this.studentId = studentId;
		this.departmentId = departmentId;
	}
	
	public String getStudentId() {
		return studentId;
	}
//	public void setStudentId(String studentId) {
//		this.studentId = studentId;
//	}
	public String getDepartmentId() {
		return departmentId;
	}
//	public void setDepartmentId(String departmentId) {
//		this.departmentId = departmentId;
//	}
	
	@Override
	public void print() {
		System.out.print("�й� : "+ studentId + ", ");
		super.print();
		System.out.print("�а���ȣ : " + departmentId + "\n");
	}
	
	@Override
	public String toString() {
//		return "Student [studentNumber=" + studentNumber + "]";
		return "studentId=" + studentId + ", " + super.toString() + "departmentId=" + departmentId;
	}
	
	public void printName() {
		System.out.println("�̸�: "+ getName());
	}

}
