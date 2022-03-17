package JavaMission03;

public class SchoolTest {

	public static void main(String[] args) {
		
		Student s = new Student("1", "김학생", "010-1111-1111", "11");
		Professor p = new Professor("2", "김교사", "010-2222-2222", "22");
		
		System.out.println("학생번호\t이름\t전화번호\t\t소속학과번호");
		System.out.println(s.getStdNo() + "\t" + s.getName() + "\t" + s.getPhone() + "\t" + s.getDeptNo());
		System.out.println("교수번호\t이름\t전화번호\t\t담당과목번호");
		System.out.println(p.getProNo() + "\t" + p.getName() + "\t" + p.getPhone() + "\t" + p.getSubNo());
	}

}
