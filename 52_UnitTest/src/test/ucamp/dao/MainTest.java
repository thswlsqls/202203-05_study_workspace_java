package test.ucamp.dao;

import ucamp.dao.MemberDAO;

public class MainTest {
	public static void main(String[] args) {
		MemberDAO m1=new MemberDAO();
		m1.login(null, null);
		m1.login("admin", "1234");
	}
}
