package test.com.test.model;

import com.test.model.UserDAO;
import com.test.model.UserWriterDAO;

public class TestDAO {		
	public static void main(String[] args) {
		
		UserDAO uDao = new UserDAO();
		UserWriterDAO uwDao = new UserWriterDAO();
		
//		System.out.println(uDao.addUser("aaaa", "bbbb", "�л�"));
//		System.out.println(uDao.login("aaaa", "bbbb"));
//		System.out.println(uDao.getUser("aaaa"));
		
//		System.out.println(uwDao.addUserWriter("bbbb", "�л��л�", "w123", "���ϳ����Դϴ�"));
//		System.out.println(uwDao.getUserWriterList());
//		System.out.println(uwDao.getUserWriter("5"));
//		System.out.println(uwDao.getWriterPw("7"));
		System.out.println(uwDao.updateWriter("7", "������������77"));
	}
}
