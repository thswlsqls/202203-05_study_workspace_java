package test.com.oopsw;

import com.oopsw.Student;
import com.oopsw.StudentService;
import com.oopsw.StudentService;

public class StudentServiceTest {
	public static void main(String[] args) {
//		StudentService s1=new StudentServiceImpl();
//		StudentService s1=new StudentService("�л��й�", "�л��̸�");
//		StudentService s1=new StudentService("200101001", "ȫ�浿");
//		
//		StudentService studentList=new StudentService();
		try {
			StudentService client1=StudentService.getInstance();
			StudentService client2=StudentService.getInstance();
			
			client1.add(new Student("s0001", "���л�")); // 2-4 �̸����̿��� �׽�Ʈ
			client2.add(new Student("s0002", "���л�"));
			client2.add(new Student("s0002", "���л�"));
			
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
