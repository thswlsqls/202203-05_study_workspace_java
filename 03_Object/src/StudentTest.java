public class StudentTest {
	
	// 2���� �л��� ������ Ȯ��
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

/**�л��� �й�, �̸�, ������ �ִ�.
�л��� ������ Ȯ���� �� �ִ�.*/
/**
 * 
 *public class StudentTest {
	public static void main(String[] args) {
		String studentNumber;
		String name;
		char gender;
		
		//2���� �л��� ������ Ȯ��
		studentNumber ="200763033";
		name="�����";
		gender='��';
		System.out.println("�й�:"+studentNumber+" �̸�: "+name+" ����: "+gender);
		studentNumber ="200763035";
		name="���̾�";
		gender='��';
		System.out.println("�й�:"+studentNumber+" �̸�: "+name+" ����: "+gender);

	}
}
 */
/**
 * 
 * //int num=10
public class StudentTest {
	public static void main(String[] args) {		
		//2���� �л��� ������ Ȯ��
		Student s1 = new Student();
		s1.studentNumber ="200763033";
		s1.name="�����";
		s1.gender='��';
		System.out.println("�й�:"+s1.studentNumber+" �̸�: "+s1.name+" ����: "+s1.gender);
		
		Student s2=new Student();
		s2.studentNumber ="200763035";
		s2.name="���̾�";
		s2.gender='��';
		System.out.println("�й�:"+s2.studentNumber+" �̸�: "+s2.name+" ����: "+s2.gender);

	}
}	

 */

/**
 * StudentTest3
 * //int num=10
public class StudentTest {
	public static void main(String[] args) {		
		//2���� �л��� ������ Ȯ��
		Student s1 = new Student("200101001", "ȫ�浿", 'M');		
		Student s2=new Student();
		
		System.out.println(s1.getStudentNumber()+" "+ s1.getName()+" "+ s1.getGender());
		System.out.println(s2.getStudentNumber()+" "+ s2.getName()+" "+ s2.getGender());
	}
}	
 */
	

