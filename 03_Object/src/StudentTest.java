public class StudentTest {
	
	// 2명의 학생의 정보를 확인
	public void printStudInfo(Student st1, Student st2) {
		System.out.println(st1.getStudentNumber() + " " + st1.getName() + " " + st1.getGender());
		System.out.println(st2.getStudentNumber() + " " + st2.getName() + " " + st2.getGender());
	}
	
	public static void main(String[] args) {
		
		StudentTest stt = new StudentTest();

//		Student st1 = new Student();
//		Student st2 = new Student();
		
//		st1.setStudentNumber("1");
//		st1.setName("aaa");
//		st1.setGender('F');
//		
//		st2.setStudentNumber("2");
//		st2.setName("bbb");
//		st2.setGender('M');
		
		Student st1 = new Student("1", "aaa", 'F');
		Student st2 = new Student("2", "bbb", 'M');
		
		stt.printStudInfo(st1, st2);
	}

}

/**학생은 학번, 이름, 성별이 있다.
학생의 정보를 확인할 수 있다.*/
/**
 * 
 *public class StudentTest {
	public static void main(String[] args) {
		String studentNumber;
		String name;
		char gender;
		
		//2명의 학생의 정보를 확인
		studentNumber ="200763033";
		name="춘식이";
		gender='여';
		System.out.println("학번:"+studentNumber+" 이름: "+name+" 성별: "+gender);
		studentNumber ="200763035";
		name="라이언";
		gender='남';
		System.out.println("학번:"+studentNumber+" 이름: "+name+" 성별: "+gender);

	}
}
 */
/**
 * 
 * //int num=10
public class StudentTest {
	public static void main(String[] args) {		
		//2명의 학생의 정보를 확인
		Student s1 = new Student();
		s1.studentNumber ="200763033";
		s1.name="춘식이";
		s1.gender='여';
		System.out.println("학번:"+s1.studentNumber+" 이름: "+s1.name+" 성별: "+s1.gender);
		
		Student s2=new Student();
		s2.studentNumber ="200763035";
		s2.name="라이언";
		s2.gender='남';
		System.out.println("학번:"+s2.studentNumber+" 이름: "+s2.name+" 성별: "+s2.gender);

	}
}	

 */

/**
 * StudentTest3
 * //int num=10
public class StudentTest {
	public static void main(String[] args) {		
		//2명의 학생의 정보를 확인
		Student s1 = new Student("200101001", "홍길동", 'M');		
		Student s2=new Student();
		
		System.out.println(s1.getStudentNumber()+" "+ s1.getName()+" "+ s1.getGender());
		System.out.println(s2.getStudentNumber()+" "+ s2.getName()+" "+ s2.getGender());
	}
}	
 */
	

