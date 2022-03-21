package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �л��� ������ ������ ���� 2�� �Է� -> ����p.247, p.253 ������ Ŭ���� �� ��ȯ , p.259 ������, p.273 �ٿ�ĳ����
		Person student1 = new Student("001", "���л�", "010-1234-5678", "��ǻ�Ͱ��а�");
		Person student2 = new Student("002", "���л�", "010-8765-4321", "ö�а�");
		Person teacher1 = new Teacher("t003", "�ڼ�����", "010-5225-7899", "�ڷᱸ��");
		Person teacher2 = new Teacher("t004", "�̼�����", "010-3214-7837", "�˰���");

		Person[] person = {student1, student2, teacher1, teacher2};	// �Էµ� ��� �迭
		Person[] teacher = {teacher1, teacher2};	// �����Ը� �ʿ��� �迭
		
		// 1. �л��� ������ ��ȭ��ȣ ����
		student1.setPhoneNumber("010-1111-1111");
		teacher1.setPhoneNumber("010-9999-9999");
//		((Teacher)teacher1).setTeacherNumber("111-111-111");
		
		// 2. �Էµ� ����� ��� ������ Ȯ��
		for (Person p : person) {
			p.print();
		}
		
		// 3. �Էµ� ����� �����߿� �̸��� Ȯ��
		for (Person p : person) {
			System.out.println("�̸� : " + p.getName());
		}

		// 4. �Էµ� �������� ��� ���� Ȯ�� -> �ٿ�ĳ����		
		for (Person t : teacher) {
			System.out.println("������ : " + ((Teacher)t).getTeacherSubject());
		}
		/* Person Ÿ���� �迭 person���� foreach���� ����ϸ� 
		 Student�� Teacher�� ��Ӱ��谡 �ƴϱ� ������ ����ȯ ���� �߻�.
		 Teacher Ÿ�� �迭�� ���� ����� PersonŬ���� -> TeacherŬ���� �ٿ�ĳ�����Ͽ�
		 TeacherŬ������ getTeacherSubject() �޼��� ���.
		*/
		
	}	

}
