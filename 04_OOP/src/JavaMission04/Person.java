package JavaMission04;

public class Person {

	/**��� �̸�*/
	private String name;
	/** ��ȭ��ȣ*/
	private String phone;
	
	public Person() {};
	
	/** ������ ���� */
	public Person(String name, String phone) {
		super();
		this.name = name;
//		this.phone = phone;
//		setName(name);
		setPhone(phone);
	}
	
	// 2. getter, setter ����
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
		System.out.print("�̸�: " + name + ", " + "��ȭ��ȣ : " + phone + ", ");
	}

	@Override
	public String toString() {
		return "name=" + name + ", phone=" + phone + ", ";
	}
	
}
