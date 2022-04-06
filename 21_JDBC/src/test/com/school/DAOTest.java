package test.com.school;

import java.sql.SQLException;
import java.util.Arrays;

import com.school.EmployeeDAO;

public class DAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDAO dao=new EmployeeDAO();
		
//		System.out.println(dao.getEmployees());
		
//		System.out.println(dao.getEmployees("IT"));
//		System.out.println(dao.getEmployees("jeon"));
//		for (float salary : dao.getSalaryData()) {
//			System.out.println(salary);
//		}
//		System.out.println(Arrays.toString(dao.getSalaryData()));
//		System.out.println(dao.getSalaryData());
		
//		System.out.println(dao.getEmployee(101));
		
		// insert를 확인은 1번만 체크, 2번째는 무결성 제약 조건 위반 오류임
//		System.out.println(dao.addUser("a001", "김사람", 20));
		
		System.out.println(dao.setUserPoint(15, "a002"));
		System.out.println(dao.removeUser("a002"));
		
		System.out.println("정상종료");
	}
}
