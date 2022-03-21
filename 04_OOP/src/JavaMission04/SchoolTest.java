package JavaMission04;

public class SchoolTest {

	public static void main(String[] args) {
		
		Person[] p = new Person[4];
//		p[0] = new Person("�̸�", "��ȭ��ȣ"); // ���밴ü�θ� ���, ���� ��ü�δ� ����ϰ� ���� �ʴ�.
		p[0] = new Student("11", "aaa", "010-1111-1111", "111");
		p[1] = new Student("12", "bbb", "010-1111-2222", "112");
		p[2] = new Professor("21", "ccc", "010-2222-1111", "221");
		p[3] = new Professor("22", "ddd", "010-2222-2222", "222");
		
		// 1. �л��� ������ ��ȭ��ȣ�� ���� ==> ��ӹ��� ����� ������ ���� �ϵ� �ٷ� ��� ������
		p[0].setPhone("010-1111-1112");
		p[2].setPhone("010-2222-1112");
		
		
		// 2. �Էµ� ����� ��� ������ Ȯ�� = System.out.println() 
		for(Person tmp : p) {
			//tmp.print();
			System.out.println(tmp); // tmp.toString()
		}
		
		// 3. �Էµ� ����� ����� �̸��� Ȯ��
		for(Person tmp : p) {
			System.out.println("�̸�: "+tmp.getName());
		}
		
		// 4. �Էµ� �������� ��� ���� Ȯ�� -> �ٿ�ĳ����
		for(Person t : p) {
			if( t instanceof Professor) {
				System.out.println("������: " + ((Professor)t).getSubjectId());
			} else {
				System.out.println("���縸 ����");
			}
		}
		
		
		
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
