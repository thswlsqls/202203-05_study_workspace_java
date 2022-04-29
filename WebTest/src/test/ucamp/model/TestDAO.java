package test.ucamp.model;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;

public class TestDAO {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		VisitorDAO vDao = new VisitorDAO();
		
//		System.out.println(mDao.addUser("park2", "박학생", "1234", "m", 
//				"reading cooking watchingMovie", "AB"));
//		System.out.println(mDao.login("kim", "1234"));
//		System.out.println(mDao.getMember("kim"));
//		System.out.println(vDao.getVisitorList());
//		System.out.println(vDao.getVisitor("1"));
//		System.out.println(vDao.addVisitor("kim", "w123", "방명록내용입니다"));
//		System.out.println(vDao.updateVisitor("3", "수정합니다"));D
//		System.out.println(vDao.getVisitorPw("1"));
//		System.out.println(vDao.deleteVisitor("4"));
//		System.out.println(mDao.isValidAddMemberId("choi"));
		System.out.println(vDao.getVisitorListById("k"));
	}
}