package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생과 교사의 정보를 각각 2명씩 입력 -> 교재p.247, p.253 묵시적 클래스 형 변환 , p.259 다형성, p.273 다운캐스팅
		Person student1 = new Student("001", "김학생", "010-1234-5678", "컴퓨터공학과");
		Person student2 = new Student("002", "나학생", "010-8765-4321", "철학과");
		Person teacher1 = new Teacher("t003", "박선생님", "010-5225-7899", "자료구조");
		Person teacher2 = new Teacher("t004", "이선생님", "010-3214-7837", "알고리즘");

		Person[] person = {student1, student2, teacher1, teacher2};	// 입력된 사람 배열
		Person[] teacher = {teacher1, teacher2};	// 선생님만 필요한 배열
		
		// 1. 학생과 교사의 전화번호 수정
		student1.setPhoneNumber("010-1111-1111");
		teacher1.setPhoneNumber("010-9999-9999");
//		((Teacher)teacher1).setTeacherNumber("111-111-111");
		
		// 2. 입력된 사람의 모든 정보를 확인
		for (Person p : person) {
			p.print();
		}
		
		// 3. 입력된 사람의 정보중에 이름만 확인
		for (Person p : person) {
			System.out.println("이름 : " + p.getName());
		}

		// 4. 입력된 선생님의 담당 과목 확인 -> 다운캐스팅		
		for (Person t : teacher) {
			System.out.println("담당과목 : " + ((Teacher)t).getTeacherSubject());
		}
		/* Person 타입의 배열 person으로 foreach문을 사용하면 
		 Student와 Teacher는 상속관계가 아니기 때문에 형변환 오류 발생.
		 Teacher 타입 배열을 따로 만들어 Person클래스 -> Teacher클래스 다운캐스팅하여
		 Teacher클래스의 getTeacherSubject() 메서드 사용.
		*/
		
	}	

}
