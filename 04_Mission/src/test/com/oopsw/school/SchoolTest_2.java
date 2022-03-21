package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class SchoolTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생과 교사의 정보를 각각 2명씩 입력 -> 교재p.247, p.253 묵시적 클래스 형 변환 , p.259 다형성, p.273 다운캐스팅

		Person[] p = new Person[4];
		//p[0]= new Person("이름", "전화번호");  // 공통객체로만 사용, 개별 객체로는 사용하고 싶지 않다.
		p[0]= new Student("001", "김학생", "010-1234-5678", "컴퓨터공학과");
		p[1]= new Student("002", "나학생", "010-8765-4321", "철학과");
		p[2]= new Teacher("t003", "박선생님", "010-5225-7899", "자료구조");
		p[3]= new Teacher("t004", "이선생님", "010-3214-7837", "알고리즘");
		
		// 1. 학생과 교사의 전화번호 수정  ==> 상속받은 멤버는 선언을 뭘로 하든 바로 사용 가능
		p[0].setPhoneNumber("010-1111-1111");
		p[3].setPhoneNumber("010-9999-9999");

		
		// 2. 입력된 사람의 모든 정보를 확인 = System.out.println()
		for (Person tmp : p) {
			//tmp.print();
			System.out.println(tmp);  //tmp.toString()
		}
		
		// 3. 입력된 사람의 정보중에 이름만 확인
		for (Person tmp : p) {
			System.out.println("이름 : " + tmp.getName());
		}

		// 4. 입력된 선생님의 담당 과목 확인 -> 다운캐스팅		
		for (Person t : p) {
			if(t instanceof Teacher)
				System.out.println("담당과목 : " + ((Teacher)t).getTeacherSubject());
			else
				System.out.println("교사만 가능");
		}
		
	}	

}
