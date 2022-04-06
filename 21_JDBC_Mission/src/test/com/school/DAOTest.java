package test.com.school;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;

import com.school.EmployeeDAO;
import com.school.EnrollmentDAO;
import com.school.LectureDAO;
import com.school.ProfessorDAO;
import com.school.SchoolDAO;

public class DAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		EmployeeDAO emDao=new EmployeeDAO();
//		System.out.println(emDao.getEmployeeDataOfManager(121, 3000));
		
//		for (int[] arr : emDao.getEmployeeDataOfManager(3000)) {
//		System.out.println(Arrays.toString(arr));
//		}
		
//		EnrollmentDAO enDao = new EnrollmentDAO();
//		System.out.println(enDao.getHighestScoredScodes());
		
//		System.out.println(enDao.getEnrollments("98/03/01", "98/03/03"));
		
//		LectureDAO leDao = new LectureDAO();
//		System.out.println(leDao.getLectures("DBMS"));
		
//		SchoolDAO scDao = new SchoolDAO();
//		System.out.println(scDao.getSchoolDatas("DBMS"));
		
		ProfessorDAO prDao = new ProfessorDAO();
		System.out.println(prDao.setProfessor("associate professor", 500000));
	}
}
