package JavaMission04;

public class Person {

	private String name;
	private String phone;
	
	public Person() {};
	
	public Person(String name, String phone) {
		super();
		this.name = name;
//		this.phone = phone;
//		setName(name);
		setPhone(phone);
	}
	
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
	
	public void print() {
		System.out.print("이름: " + name + ", " + "전화번호 : " + phone + ", ");
	}

	@Override
	public String toString() {
		return "name=" + name + ", phone=" + phone + ", ";
	}
	
}
