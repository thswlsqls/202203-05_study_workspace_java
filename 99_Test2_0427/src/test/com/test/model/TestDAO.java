package test.com.test.model;

import com.test.model.UserDAO;
import com.test.model.UserWriterDAO;

public class TestDAO {		
	public static void main(String[] args) {
		
		UserDAO uDao = new UserDAO();
		UserWriterDAO uwDao = new UserWriterDAO();
		
//		System.out.println(uDao.addUser("aaaa", "bbbb", "학생"));
//		System.out.println(uDao.login("aaaa", "bbbb"));
//		System.out.println(uDao.getUser("aaaa"));
		
//		System.out.println(uwDao.addUserWriter("bbbb", "학생학생", "w123", "방명록내용입니다"));
//		System.out.println(uwDao.getUserWriterList());
//		System.out.println(uwDao.getUserWriter("5"));
//		System.out.println(uwDao.getWriterPw("7"));
		System.out.println(uwDao.updateWriter("7", "수정수정수정77"));
	}
}
