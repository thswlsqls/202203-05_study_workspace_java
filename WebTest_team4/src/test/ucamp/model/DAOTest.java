package test.ucamp.model;

import ucamp.model.MemberDAO;
import ucamp.model.MemberVisitDAO;

public class DAOTest {
	public static void main(String[] args) {
		//MemberDAO dao = new MemberDAO();
		//System.out.println(dao.addUser("yesJang", "��׷�", "9999", "m", "����", "AB"));
		//System.out.println(dao.login("yesJang", "9999"));
		
		MemberVisitDAO dao = new MemberVisitDAO();
		System.out.println(dao.getWrite());
		//System.out.println(dao.addWrite("yesJang", "9988", "����"));
		//System.out.println(dao.updateWrite("��������", "yesJang", "9988", "7"));
		//System.out.println(dao.deleteWrite("7", "9988"));
	}
}
