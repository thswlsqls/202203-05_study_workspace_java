package JavaMission03;
public class Student{
	
	private String stdNo;
	private String name;
	private String phone;
	private String deptNo;
	
	public Student() {};
	
	public Student(String stdNo, String name, String phone, String deptNo) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.phone = phone;
		this.deptNo = deptNo;
	}
	
	public String getStdNo() {
		return stdNo;
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
	public String getDeptNo() {
		return deptNo;
	}
//	public void setDeptNo(String deptNo) {
//		this.deptNo = deptNo;
//	}
	
	
	
}
