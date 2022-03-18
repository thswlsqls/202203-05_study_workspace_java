package JavaMission04;

public class Professor extends Person{
	
	private String professorId;
	private String subjectId;
	
	public Professor() {};
	
	public Professor(String professorId, String name, String phone, String subjectId) {
		super(name, phone);
		this.professorId = professorId;
		this.subjectId = subjectId;
	}
	
	public String getProfessorId() {
		return professorId;
	}
//	public void setProfessorId(String professorId) {
//		this.professorId = professorId;
//	}
	public String getSubjectId() {
		return subjectId;
	}
//	public void setSubjectId(String subjectId) {
//		this.subjectId = subjectId;
//	}
	
	@Override
	public void print() {
		System.out.print("교번 : "+ professorId + ", ");
		super.print();
		System.out.print("담당과목번호 : " + subjectId + " \n");
	}

	@Override
	public String toString() {
//		return "professorId=" + professorId + ", subjectId=" + subjectId;
		return "professorId=" + professorId + ", " + super.toString() + "subjectId=" + subjectId;
	}
	
	public void printSubjectId() {
		System.out.println("과목번호 : " + getSubjectId());
	}
	

}
