package test.com.project.model;

import java.sql.SQLException;

import com.project.model.FollowListVO;
import com.project.model.InteractionMapperDAO;

public class MyBatisTest {
	public static void main(String[] args) {
		InteractionMapperDAO iDao=new InteractionMapperDAO();	
//		MemberVO vo=dao.selectId("jeon");
//		System.out.println(vo);
		
		//System.out.println(dao.selectList());
		
		//dao.addMember(new MemberVO("kim2", "0000", "±è¹Î¼º"));
		
//		System.out.println(iDao.addFollow(new FollowListVO("test4", "test12", "pen_test4")));
		
//		System.out.println(iDao.getSortedByDateFollowList("test2"));
		
//		try {
//			System.out.println(iDao.getSortedByPenNameFollowList("test2"));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(iDao.addReaction("test4", "1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(iDao.deleteReaction("test4", "6"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(iDao.isReacted("test4", "1"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(iDao.countReactions("1"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			System.out.println(iDao.getFollowList("test4"));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//dao.updateMember(new MemberVO("kim", "8888"));
		
		//dao.removeMember("kim");
		
		//System.out.println(dao.selectList());
	}
}
