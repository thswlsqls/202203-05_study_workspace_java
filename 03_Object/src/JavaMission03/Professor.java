package JavaMission03;

public class Professor {
	
	private String professorId;
	private String name;
	private String phone;
	private String subjectId;
	
	public Professor() {};
	
	public Professor(String professorId, String name, String phone, String subjectId) {
		super();
		this.professorId = professorId;
		this.name = name;
		this.phone = phone;
		this.subjectId = subjectId;
	}
	
	public String getProfessorId() {
		return professorId;
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
	public String getSubjectId() {
		return subjectId;
	}
//	public void setSubNo(String subNo) {
//		this.subNo = subNo;
//	}
	
	//20220318 ���� -> 4. ���� ������� �ʿ��� �޼��带 ������.
	public void print() {
		System.out.println("������ȣ\t�̸�\t��ȭ��ȣ\t\t�������ȣ");
		System.out.println(getProfessorId() + "\t" + getName() + "\t" + getPhone() + "\t" + getSubjectId());
	}
	

}
