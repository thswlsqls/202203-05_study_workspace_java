package JavaMission04;

public class Person {

	/**사람 이름*/
	private String name;
	/** 전화번호*/
	private String phone;
	
	public Person() {};
	
	/** 생성자 정의 */
	public Person(String name, String phone) {
		super();
		this.name = name;
//		this.phone = phone;
//		setName(name);
		setPhone(phone);
	}
	
	// 2. getter, setter 생성
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
