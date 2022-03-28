package test.com.oopsw;

import com.oopsw.Student;
import com.oopsw.StudentService;
import com.oopsw.StudentService;

public class StudentServiceTest {
	public static void main(String[] args) {
//		StudentService s1=new StudentServiceImpl();
//		StudentService s1=new StudentService("학생학번", "학생이름");
//		StudentService s1=new StudentService("200101001", "홍길동");
//		
//		StudentService studentList=new StudentService();
		try {
			StudentService client1=StudentService.getInstance();
			StudentService client2=StudentService.getInstance();
			
			client1.add(new Student("s0001", "김학생")); // 2-4 이름길이예외 테스트
			client2.add(new Student("s0002", "김학생"));
			client2.add(new Student("s0002", "박학생"));
			
			System.out.println(client1.getStudents());
			System.out.println(client1);
			System.out.println(client2);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
