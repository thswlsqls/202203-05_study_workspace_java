package test.com.test.model;

import com.test.model.UserDAO;
import com.test.model.UserWriterDAO;

public class TestDAO {
	public static void main(String[] args) {
		
		UserDAO uDao = new UserDAO();
		UserWriterDAO uwDao = new UserWriterDAO();
		
//		System.out.println(new UserDAO().addUser("studentKim", "1234", "���л�"));
//		System.out.println(new UserDAO().login("studentKim", "1234"));
		System.out.println(uwDao.addWriter("studentKim", "���л�", "w123", "���ϳ����Դϴ�"));
		
	}
}
