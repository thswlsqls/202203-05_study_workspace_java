package test.ucamp.model;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;

public class TestDAO {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		VisitorDAO vDao = new VisitorDAO();
		
//		System.out.println(mDao.addUser("park2", "���л�", "1234", "m", 
//				"reading cooking watchingMovie", "AB"));
//		System.out.println(mDao.login("kim", "1234"));
//		System.out.println(mDao.getMember("kim"));
//		System.out.println(vDao.getVisitorList());
//		System.out.println(vDao.getVisitor("1"));
//		System.out.println(vDao.addVisitor("kim", "w123", "���ϳ����Դϴ�"));
//		System.out.println(vDao.updateVisitor("3", "�����մϴ�"));D
//		System.out.println(vDao.getVisitorPw("1"));
//		System.out.println(vDao.deleteVisitor("4"));
//		System.out.println(mDao.isValidAddMemberId("choi"));
		System.out.println(vDao.getVisitorListById("k"));
	}
}