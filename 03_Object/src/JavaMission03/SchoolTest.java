package JavaMission03;

public class SchoolTest {

	public static void main(String[] args) {
		
		Student s = new Student("1", "���л�", "010-1111-1111", "11");
		Professor p = new Professor("2", "�豳��", "010-2222-2222", "22");
		
		System.out.println("�л���ȣ\t�̸�\t��ȭ��ȣ\t\t�Ҽ��а���ȣ");
		System.out.println(s.getStdNo() + "\t" + s.getName() + "\t" + s.getPhone() + "\t" + s.getDeptNo());
		System.out.println("������ȣ\t�̸�\t��ȭ��ȣ\t\t�������ȣ");
		System.out.println(p.getProNo() + "\t" + p.getName() + "\t" + p.getPhone() + "\t" + p.getSubNo());
	}

}
