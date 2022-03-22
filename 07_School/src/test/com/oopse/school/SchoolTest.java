package test.com.oopse.school;

import com.oopse.school.Person;
import com.oopse.school.SchoolService;
import com.oopse.school.SchoolServiceImpl;
import com.oopse.school.Student;

//C2)
public class SchoolTest {

	public static void main(String[] args) {
		SchoolService s;
		s=new SchoolServiceImpl(); //
		
		System.out.println(s.getPersons());
		
		s.addPerson(new Person("세종대왕"));
		s.addPerson(new Student("2001", "홍길동"));
		s.addPerson(new Student("2002", "홍길동"));
		s.addPerson(new Student("2003", "홍길동"));
		
		System.out.println();
		System.out.println(s.getPersons());
		System.out.println(s.getStudents());
		
		System.out.println();
		System.out.println(s.getStudentName("2003"));
		System.out.println(s.getStudentName("xxxxxxxx"));
		
		System.out.println();
		System.out.println(s.setStudentName("2003", "이름수정"));
		System.out.println(s.setStudentName("xxxxxxxx", "이름수정"));
		System.out.println(s.getPersons());
	}

}


//package test.com.oopsw.school;
//
//import com.oopsw.school.Person;
//import com.oopsw.school.SchoolService;
//import com.oopsw.school.SchoolServiceImpl;
//import com.oopsw.school.Student;
//
////C2)
//public class SchoolTest {
//	public static void main(String[] args) {
//		SchoolService s;
//		s=new SchoolServiceImpl();//
//		System.out.println(s.getPersons());
//		s.addPerson(new Person("세종대왕"));
//		s.addPerson(new Student("2001", "홍길동"));
//		s.addPerson(new Student("2002", "홍길동"));
//		s.addPerson(new Student("2003", "전혜영"));
//		
//		System.out.println(s.getPersons());
//		System.out.println(s.getStudents());
//		
//		System.out.println(s.getStudentName("2003"));
//		System.out.println(s.getStudentName("xxxxxx"));
//		
//		System.out.println(s.setStudentName("2003", "이름수정"));
//		System.out.println(s.setStudentName("XXXXX", "이름수정"));
//		System.out.println(s.getPersons());
//	}
//}
