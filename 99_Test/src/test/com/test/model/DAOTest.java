package test.com.test.model;

import java.sql.Date;

import com.test.model.MemberDAO;

public class DAOTest {

	public static void main(String[] args) {
		System.out.println(new MemberDAO().addMember("studentKim", "1234", "±èÇÐ»ý", "01000020003", "³²", "reading watchingMovie exercise", "1999.9.3"));
//		System.out.println(new MemberDAO().login("studentKim", "1234"));
	
	}
}
