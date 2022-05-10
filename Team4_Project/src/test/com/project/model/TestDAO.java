package test.com.project.model;

import java.sql.SQLException;

import com.project.model.WriterDAO;

public class TestDAO {
	public static void main(String[] args) {
		WriterDAO wDao = new WriterDAO();
		
//		try {
//			System.out.println(wDao.diaryWrite("새로운글", "test1", "851"));
//		} catch (SQLException e1) {e1.printStackTrace();}
//		try {
//			System.out.println(wDao.diaryModify("test1", "1", "수정한 글"));
//		} catch (SQLException e) {e.printStackTrace();}
//		try {
//			System.out.println(wDao.diaryRemove("test1", "3"));
//		} catch (SQLException e) {e.printStackTrace();}
//		try {
//			System.out.println(wDao.setShareStatus("개인", "1", "test1"));
//		} catch (SQLException e) {e.printStackTrace();}
//		System.out.println(wDao.getNewBoardList());
		System.out.println(wDao.getNowRecommendedBoardList());
		//System.out.println(wDao.getHomeBoardList("110"));
//		System.out.println(wDao.diaryWrite);
	}
}
