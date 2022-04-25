package test.com.ucamp.model;

import java.sql.SQLException;

import com.ucamp.model.MemberDAO;
import com.ucamp.model.User;

public class DAOTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//MemberDAO dao=new MemberDAO();
	//	System.out.println(new MemberDAO().login("admin", "12345"));
	//	System.out.println(new MemberDAO().login("jjeon", "12345"));
		
		//System.out.println(dao.addUser(new User("abc", "1234", "ȫ�浿")));
		
		System.out.println(new MemberDAO().getDepartments());
		
	}
}
