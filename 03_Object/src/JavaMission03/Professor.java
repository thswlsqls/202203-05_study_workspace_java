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
	
	//20220318 리뷰 -> 4. 업무 기반으로 필요한 메서드를 정의함.
	public void print() {
		System.out.println("교수번호\t이름\t전화번호\t\t담당과목번호");
		System.out.println(getProfessorId() + "\t" + getName() + "\t" + getPhone() + "\t" + getSubjectId());
	}
	

}
