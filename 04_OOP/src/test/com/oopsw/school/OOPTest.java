package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {

	public static void main(String[] args) {
		// 왜?
		// 요구사항을 기반으로 쓰는 상황 체크함
		// 두수(정수)를 입력받아서 XXXXXX
		int num1, num2;
		
		// 두수 (10, 10.5)
		float f1 = 10; 
		double d1 = 10.5;
		
		// 학생이 XXX하면 학생의 정보를 확인함
		Student s1 = new Student("200101001", "홍길동");
		
		// 학사 시스템은 XXX에 따라 학생 또는 교사 ... 의 정보를 확인할 수 있음
		Person p1 = new Student("200101002", "이순신");
		p1 = new Teacher("t001", "세종대왕");
		
		// int num3 = 10.5; // 실수는 정수보다 크기 때문에 안된다.
		// Student s2 = new Person(); // 부모 Person은 자식보다 크기 때문에 안된디.
		// Student s3 = new Teacher("t001", "선생님"); // 학생과 교사는 상속관계가 없다.
	}

}

/**
 * 

package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {
	public static void main(String[] args) {
		//왜???
		//요구사항을 기반으로 쓰는 상황 체크
		//두수(정수)를 입력받아서 XXXXXX
		int num1=10, num2=20;
		
		//두수 (10, 10.5)
		float f1 =10;
		double d1 =10.5;
		
		//학생이 XXX 하면 학생의 정보를 확인
		Student s1=new Student("200101001", "홍길동");
		
		//학사 시스템은 XXX에 따라 학생 또는 교사 ....의 정보를 확인
		Person p1=new Student("200101002", "이순신");
		p1=new Teacher("t001", "세종대왕");
		
		//안되는 이유가 명확하면 되는 이유를 잘 활용
		//int num3 = 10.5;   //실수는 정수보다 크기때문에 안된다.
		//Student s2=new Person();  //부모 Person은 자식보다 크기때문에 안된다.
		//Student s3=new Teacher("t001", "선생님");  //학생과 교사는 상속관계가 없다.
		
	}
}

 *
 */
