package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �л��� ������ ������ ���� 2�� �Է� -> ����p.247, p.253 ������ Ŭ���� �� ��ȯ , p.259 ������, p.273 �ٿ�ĳ����

		Person[] p = new Person[4];
		//p[0]= new Person("�̸�", "��ȭ��ȣ");  // ���밴ü�θ� ���, ���� ��ü�δ� ����ϰ� ���� �ʴ�.
		p[0]= new Student("001", "���л�", "010-1234-5678", "��ǻ�Ͱ��а�");
		p[1]= new Student("002", "���л�", "010-8765-4321", "ö�а�");
		p[2]= new Teacher("t003", "�ڼ�����", "010-5225-7899", "�ڷᱸ��");
		p[3]= new Teacher("t004", "�̼�����", "010-3214-7837", "�˰���");
		
		// 1. �л��� ������ ��ȭ��ȣ ����  ==> ��ӹ��� ����� ������ ���� �ϵ� �ٷ� ��� ����
		p[0].setPhoneNumber("010-1111-1111");
		p[3].setPhoneNumber("010-9999-9999");

		
		// 2. �Էµ� ����� ��� ������ Ȯ�� = System.out.println()
		for (Person tmp : p) {
			//tmp.print();
			System.out.println(tmp);  //tmp.toString()
		}
		
		// 3. �Էµ� ����� �����߿� �̸��� Ȯ��
		for (Person tmp : p) {
			System.out.println("�̸� : " + tmp.getName());
		}

		// 4. �Էµ� �������� ��� ���� Ȯ�� -> �ٿ�ĳ����		
		for (Person t : p) {
			if(t instanceof Teacher)
				System.out.println("������ : " + ((Teacher)t).getTeacherSubject());
			else
				System.out.println("���縸 ����");
		}
		
	}	

}
