package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

// 기능이 돌아가는지 확인 - 예약어(VM)에 의문이 생길 수 있음 - 오류 상황을 확인할 필요 있음 - 근거(사례)를 찾아야 함 - API
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("홍길동");
		Student s1 = new Student("200101001", "이순신");
		Teacher t1 = new Teacher("t001", "세종대왕");
		
		p.print();
		s1.print();
		t1.print();
	}
}


/**
 * 

package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;
//기능이 돌아가는지 확인 - 예약어(VM) - 오류 상황을 확인 - 근거(사례) = API(간접경험)
public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person("홍길동");
		Student s1=new Student("200101001", "이순신");
		Teacher t1=new Teacher("t001", "세종대왕");
		p.print();
		s1.print();
		t1.print();
	}
}

 * 
 */
