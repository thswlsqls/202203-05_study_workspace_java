package JavaMission03;

public class Professor {
	
	private String proNo;
	private String name;
	private String phone;
	private String subNo;
	
	public Professor() {};
	
	public Professor(String proNo, String name, String phone, String subNo) {
		super();
		this.proNo = proNo;
		this.name = name;
		this.phone = phone;
		this.subNo = subNo;
	}
	
	public String getProNo() {
		return proNo;
	}
//	public void setProNo(String proNo) {
//		this.proNo = proNo;
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
	public String getSubNo() {
		return subNo;
	}
//	public void setSubNo(String subNo) {
//		this.subNo = subNo;
//	}
	
	

}
