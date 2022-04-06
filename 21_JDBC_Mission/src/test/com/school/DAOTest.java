package test.com.school;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;

import com.school.EmployeeDAO;
import com.school.EnrollmentDAO;
import com.school.LectureDAO;
import com.school.SchoolDAO;

public class DAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EmployeeDAO emDao=new EmployeeDAO();
		EnrollmentDAO enDao = new EnrollmentDAO();
		LectureDAO leDao = new LectureDAO();
		SchoolDAO scDao = new SchoolDAO();
		
//		for (int[] arr : dao.getEmployeeDataOfManager(3000)) {
//			System.out.println(Arrays.toString(arr));
//		}
//		
//		System.out.println(dao.getEmployeeDataOfManager(121, 3000));
	
//		System.out.println(enDao.getEnrollmentData("98/03/01", "98/03/03"));
	
//		System.out.println(leDao.getLectures("DBMS"));
	
//		System.out.println(scDao.getSchoolDatas("DBMS"));
	
		System.out.println(enDao.getHighestScoredScodes());
	}
}
