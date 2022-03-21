package JavaMission04;

public class SchoolTest {

	public static void main(String[] args) {
		
		Person[] p = new Person[4];
//		p[0] = new Person("이름", "전화번호"); // 공통객체로만 사용, 개별 객체로는 사용하고 싶지 않다.
		p[0] = new Student("11", "aaa", "010-1111-1111", "111");
		p[1] = new Student("12", "bbb", "010-1111-2222", "112");
		p[2] = new Professor("21", "ccc", "010-2222-1111", "221");
		p[3] = new Professor("22", "ddd", "010-2222-2222", "222");
		
		// 1. 학생과 교사의 전화번호를 수정 ==> 상속받은 멤버는 선언을 뭘로 하든 바로 사용 가능함
		p[0].setPhone("010-1111-1112");
		p[2].setPhone("010-2222-1112");
		
		
		// 2. 입력된 사람의 모든 정보를 확인 = System.out.println() 
		for(Person tmp : p) {
			//tmp.print();
			System.out.println(tmp); // tmp.toString()
		}
		
		// 3. 입력된 사람의 정보등에 이름을 확인
		for(Person tmp : p) {
			System.out.println("이름: "+tmp.getName());
		}
		
		// 4. 입력된 선생님의 담당 과목 확인 -> 다운캐스팅
		for(Person t : p) {
			if( t instanceof Professor) {
				System.out.println("담당과목: " + ((Professor)t).getSubjectId());
			} else {
				System.out.println("교사만 가능");
			}
		}
		
		
		
		Student s1 = new Student("11", "aaa", "010-1111-1111", "111");
		Student s2 = new Student("12", "bbb", "010-1111-2222", "112");
		Professor pf1 = new Professor("21", "ccc", "010-2222-1111", "221");
		Professor pf2 = new Professor("22", "ddd", "010-2222-2222", "222");

		s1.print(); s2.print(); pf1.print(); pf2.print(); //입력된 사람의 모든 정보를 확인
		System.out.println();
		
		s1.printName(); s2.printName(); //입력된 사람의 정보중에 이름만 확인
		System.out.println(); 
		
		pf1.printSubjectId(); pf2.printSubjectId(); //입력된 선생님의 담당 과목 확인
		System.out.println();
		
		System.out.println(s1.toString());
		System.out.println(pf1.toString());
		
	}
}
