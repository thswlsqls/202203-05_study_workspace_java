package JavaMission04;

public class SchoolTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("11", "aaa", "010-1111-1111", "111");
		Student s2 = new Student("12", "bbb", "010-1111-2222", "112");
		Professor pf1 = new Professor("21", "ccc", "010-2222-1111", "221");
		Professor pf2 = new Professor("22", "ddd", "010-2222-2222", "222");

		s1.print(); s2.print(); pf1.print(); pf2.print(); //�Էµ� ����� ��� ������ Ȯ��
		System.out.println();
		
		s1.printName(); s2.printName(); //�Էµ� ����� �����߿� �̸��� Ȯ��
		System.out.println(); 
		
		pf1.printSubjectId(); pf2.printSubjectId(); //�Էµ� �������� ��� ���� Ȯ��
		System.out.println();
		
		System.out.println(s1.toString());
		System.out.println(pf1.toString());
		
	}
}
