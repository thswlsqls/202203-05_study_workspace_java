package JavaMission03;
public class Student{
	
	private String studentId;
	private String name;
	private String phone;
	private String departmentId;
	
	public Student() {};
	
	public Student(String studentId, String name, String phone, String departmentId) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.phone = phone;
		this.departmentId = departmentId;
	}
	
	public String getStudentId() {
		return studentId;
	}
//	public void setStdNo(String stdNo) {
//		this.stdNo = stdNo;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartmentId() {
		return departmentId;
	}
//	public void setDeptNo(String deptNo) {
//		this.deptNo = deptNo;
//	}
	
	//20220318 리뷰 -> 4. 업무 기반으로 필요한 메서드를 정의함.
	public void print() {
		System.out.println("학생번호\t이름\t전화번호\t\t소속학과번호");
		System.out.println(getStudentId() + "\t" + getName() + "\t" + getPhone() + "\t" + getDepartmentId());
	}
}

