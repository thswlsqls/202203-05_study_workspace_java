package test.com.oopsw.school;

import com.oopsw.school.SchoolService;
import com.oopsw.school.SchoolServiceImpl;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class ServiceTest {
	public static void main(String[] args) {
		SchoolService s = new SchoolServiceImpl();
		
		//1. all
		s.printAll();
		System.out.println();
		
		//2. Test --> ���� �߷� (TDD)
		s.addPerson(new Student("200101001", "010-1111-2222", "���л�"));
		s.addPerson(new Teacher("t001","010-2222-3333", "�輱��", "����"));
		s.addPerson(new Student("200101002", "010-1111-3333", "���л�"));
		s.addPerson(new Teacher("t002","010-2222-4444", "�ڼ���", "����"));
		s.printAll();
		System.out.println();
		
		//3. ����
		s.setPhoneNumber(new Student("200101001", "011-3333-4444"));
		s.printAll();
		
		System.out.println();
		s.setPhoneNumber(new Teacher("t001", "011-4444-5555"));
		s.printAll();
		System.out.println();
		
		//4. get
		for(String name : s.getTeacherNames()) {
			System.out.println(name);
		}
		System.out.println();
		
		//5. getSubject
		System.out.println(s.getSubject("t001"));
		System.out.println(s.getSubject("t002"));
	}
}
