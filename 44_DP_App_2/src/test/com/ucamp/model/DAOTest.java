package test.com.ucamp.model;

import java.sql.SQLException;

import com.ucamp.model.UserDAO;

public class DAOTest {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {

//			System.out.println(new UserDAO().login("3333", "3333"));
//			System.out.println(new UserDAO().login("3333", "333333"));
//			System.out.println(new UserDAO().getGuestBooks());
			
//			System.out.println(new UserDAO().addGuestBook("studentKim", "�����Դϴ�333", "�����Դϴ�333"));
			System.out.println(new UserDAO().getGuestBook(1));
		}
}
