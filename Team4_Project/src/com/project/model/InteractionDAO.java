package com.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class InteractionDAO {
	private Connection conn;
	public InteractionDAO() {
		String driver = "oracle.jdbc.OracleDriver"; 
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="hr";
		String password="hr";
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("2. dbms 연결 ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("driver conn");
	}
	
	//즐겨찾기 글 목록 조회
	public Collection<BookmarkVO> getBookmarkList(String userId) throws SQLException{
		Collection<BookmarkVO> result = new ArrayList();
		
		String sql = "select bm.bookmark_date, s.suggestion_name, a.pen_name " + 
				"from bookmark bm, board bo, suggestion s, app_user a " + 
				"where bm.write_no = bo.write_no " + 
				"and bo.suggestion_code = s.suggestion_code " + 
				"and a.user_id = bo.writer_id " + 
				"and user_id = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			result.add(new BookmarkVO(rs.getString(1), rs.getString(2), rs.getString(3)));
		}
		pstmt.close();
		rs.close();
		
		return result;
	}
	//즐겨찾기 글 추가
	public boolean addBookmark(String userId, String writeNo) throws SQLException {
		boolean result=false;
		
//		String sql = "insert into bookmark values(?,sysdate,?)";
		String sql = "insert into(user_id, write_no, bookmark_date) bookmark values(?,?,sysdate)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	}
	//즐겨찾기 글 삭제
	public boolean deleteBookmark(String userId, String writeNo) throws SQLException {
		boolean result=false;
		
		String sql = "delete from bookmark where user_id = ? and write_no=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	} 
	// 즐겨찾기 글 상세조회
	public Collection<BoardVO> getBookmarkWrite(String emotionCode) throws SQLException{
		Collection<BoardVO> result = new ArrayList();
		
		String sql = "select s.suggestion_name, b.contents, a.pen_name, b.write_date, e.emotion_code " + 
				"from app_user a, board b, suggestion s, emotion e, bookmark bm " + 
				"where b.writer_id = a.user_id " + 
				"and b.writer_id = bm.user_id " + 
				"and b.suggestion_code = s.suggestion_code " + 
				"and e.emotion_code = s.emotion_code " + 
				"and e.emotion_code = ? ";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, emotionCode);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			result.add(new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
		}
		pstmt.close();
		rs.close();
		
		return result;
	}
	//팔로우(친구추가)
	public boolean addFollow(String followeeId, String followerId) throws SQLException {
		boolean result=false;
		
		String sql = "insert into follow_list values(FOLLOW_NO_SEQ.NEXTVAL,sysdate,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followeeId);
		pstmt.setString(2, followerId);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	} 
	//팔로워 목록 조회
	public Collection<FollowListVO> getFollowList(String followerId) throws SQLException{
		Collection<FollowListVO> result = new ArrayList();
		
		String sql = "select follow_date, followee_id " + 
				"from follow_list " + 
				"where follower_id = ? ";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followerId);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			result.add(new FollowListVO(rs.getString(1), rs.getString(2)));
		}
		pstmt.close();
		rs.close();
		
		return result;
	}
	//좋아요 추가
	public boolean addReaction(String userId, String writeNo) throws SQLException {
		boolean result=false;
		
		String sql = "insert into reaction values(?,?,sysdate)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	} 
	//좋아요 삭제
	public boolean deleteReaction(String userId, String writeNo) throws SQLException {
		boolean result=false;
		
		String sql = "delete from reaction where user_id = ? and write_no = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	} 
}
