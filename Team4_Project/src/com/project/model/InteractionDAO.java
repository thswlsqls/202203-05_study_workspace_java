package com.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

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
			System.out.println("2. dbms ���� ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("driver conn");
	}
	
	//���ã�� �� ��� ��ȸ --> �۹�ȣ �߰���
	public Collection<BoardVO> getBookmarkedWriteList(String userId) throws SQLException{
		Collection<BoardVO> result = new ArrayList();
		
		String sql = "select bo.write_no, bm.bookmark_date, s.suggestion_name, a.pen_name " + 
					"	from bookmark bm, board bo, suggestion s, app_user a " + 
					"	where bm.write_no = bo.write_no  " + 
					"	and bo.suggestion_code = s.suggestion_code " + 
					"	and a.user_id = bo.writer_id " + 
					"	and bm.USER_ID = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			result.add(new BoardVO(rs.getString(1)
					, rs.getDate(2)
					, rs.getString(3)
					, rs.getString(4)));
		}
		pstmt.close();
		rs.close();
		
		return result;
	}
//	public Collection<BookmarkVO> getBookmarkList(String userId) throws SQLException{
//		Collection<BookmarkVO> result = new ArrayList();
//		
//		String sql = "select bm.bookmark_date, s.suggestion_name, a.pen_name " + 
//				"from bookmark bm, board bo, suggestion s, app_user a " + 
//				"where bm.write_no = bo.write_no " + 
//				"and bo.suggestion_code = s.suggestion_code " + 
//				"and a.user_id = bo.writer_id " + 
//				"and bm.user_id = ?";
//		
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, userId);
//		ResultSet rs = pstmt.executeQuery();
//		
//		while (rs.next()) {
//			result.add(new BookmarkVO(rs.getString(1), rs.getString(2), rs.getString(3)));
//		}
//		pstmt.close();
//		rs.close();
//		
//		return result;
//	}
	//���ã�� �� �߰�
	public boolean addBookmark(String userId, String writeNo) throws SQLException {
		boolean result=false;
		
//			String sql = "insert into bookmark values(?,sysdate,?)";
		String sql = "insert into bookmark(user_id, write_no, bookmark_date) values(?,?,sysdate)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	}
	//���ã�� �� ����
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
	// ���ã�� �� ����ȸ --> �۹�ȣ �߰���
	public BoardVO getBookmarkedWrite(String userId, String writeNo) throws SQLException{
		BoardVO v = null;
		
		String sql = "select b.write_no, s.suggestion_name, b.contents, a.pen_name, b.write_date, e.emotion_code, e.emotion_name " + 
				"	from board b, app_user a, bookmark bm , suggestion s, emotion e " + 
				"	WHERE a.user_id = b.writer_id " + 
				"	and b.write_no = bm.write_no " + 
				"	and b.suggestion_code = s.suggestion_code " + 
				"	and s.emotion_code = e.emotion_code  " + 
				"	and bm.user_id = ? " + 
				"	AND bm.write_no = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			v = new BoardVO(rs.getString(1)
					, rs.getString(2)
					, rs.getString(3)
					, rs.getString(4)
					, rs.getDate(5)
					, rs.getString(6)
					, rs.getString(7));
		}
		pstmt.close();
		rs.close();
		
		return v;
	} 
//	public Collection<BoardVO> getBookmarkWrite(String userId, String writeNo) throws SQLException{
//		Collection<BoardVO> result = new ArrayList();
//		
//		String sql = "select b.write_no, s.suggestion_name, b.contents, a.pen_name, b.write_date, e.emotion_code " + 
//				"from board b, app_user a, bookmark bm , suggestion s, emotion e " + 
//				"WHERE a.user_id = b.writer_id " + 
//				"and b.write_no = bm.write_no " + 
//				"and b.suggestion_code = s.suggestion_code " + 
//				"and s.emotion_code = e.emotion_code " + 
//				"and bm.user_id = ?" + 
//				"AND bm.write_no = ?";
//		
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, userId);
//		pstmt.setString(2, writeNo);
//		ResultSet rs = pstmt.executeQuery();
//		
//		while (rs.next()) {
//			while(rs.next()) {
//				result.add(new BoardVO(rs.getString(1)
//						, rs.getString(2)
//						, rs.getString(3)
//						, rs.getString(4)
//						, rs.getDate(5)
//						, rs.getString(6)));
//				}
//		}
//		pstmt.close();
//		rs.close();
//		
//		return result;
//	}
	//�ȷο�(ģ���߰�)
	public boolean addFollow(String followeeId, String followerId) 
			throws SQLException {
		boolean result=false;
		
		String sql = "insert into follow_list values(FOLLOW_NO_SEQ.NEXTVAL,sysdate,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followeeId);
		pstmt.setString(2, followerId);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		return result;
	} 
	//�ȷο� ��� ��ȸ
	/**
	 * select fl.follow_no, to_char(fl.follow_date, 'yyyy.mm.dd'), fl.followee_id, fl.follower_id, a.pen_name
		from follow_list fl, app_user a
		where fl.followee_id = a.user_id
		AND fl.follower_id = 'test2';
	 * 
	 * */
	public Collection<FollowListVO> getFollowList(String followerId) 
			throws SQLException{
		Collection<FollowListVO> result = new ArrayList();
		
		String sql = "select fl.follow_no, to_char(fl.follow_date, 'yyyy.mm.dd'), fl.followee_id, fl.follower_id, a.pen_name " + 
				"		from follow_list fl, app_user a " + 
				"		where fl.followee_id = a.user_id " + 
				"		AND fl.follower_id = ? ";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followerId);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			result.add(new FollowListVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		pstmt.close();
		rs.close();
		
		return result;
	}
	/**
	 *--37. �ȷο� ����� �ֽż� ������ ��ȸ
		select fl.follow_no, to_char(fl.follow_date, 'yyyy.mm.dd'), fl.followee_id, fl.follower_id, a.pen_name
				from follow_list fl, app_user a
				where fl.followee_id = a.user_id
				AND fl.follower_id = 'test2'
		ORDER BY fl.follow_date;
	 * 
	 * */
	public Collection<FollowListVO> getSortedByDateFollowList(String followerId) 
			throws SQLException{
		Collection<FollowListVO> result = new ArrayList();
		String sql = "SELECT fl.follow_no"
				+ ", to_char(fl.follow_date, 'yyyy.mm.dd')"
				+ ", fl.followee_id"
				+ ", fl.follower_id"
				+ ", a.pen_name " + 
				"	FROM follow_list fl, app_user a " + 
				"	WHERE fl.followee_id = a.user_id " + 
				"	AND fl.follower_id = ?" + 
				"	ORDER BY fl.follow_date DESC";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followerId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			result.add(new FollowListVO(rs.getString(1)
					, rs.getString(2)
					, rs.getString(3)
					, rs.getString(4)
					, rs.getString(5)));
		}
		pstmt.close();
		rs.close();
		return result;
	}
	/**
	 * 38. �ȷο� ����� �ʸ� �����ټ� ������ ��ȸ
	 * 	select fl.follow_no, to_char(fl.follow_date, 'yyyy.mm.dd'), fl.followee_id, fl.follower_id, a.pen_name
			from follow_list fl, app_user a
			where fl.followee_id = a.user_id
			AND fl.follower_id = 'test2
		ORDER BY a.pen_name;
	 * */
	public Collection<FollowListVO> getSortedByPenNameFollowList(String followerId) 
			throws SQLException{
		Collection<FollowListVO> result = new ArrayList();
		String sql = "SELECT fl.follow_no"
				+ ", to_char(fl.follow_date, 'yyyy.mm.dd')"
				+ ", fl.followee_id"
				+ ", fl.follower_id"
				+ ", a.pen_name " + 
				"	FROM follow_list fl, app_user a " + 
				"	WHERE fl.followee_id = a.user_id " + 
				"	AND fl.follower_id = ?" + 
				"	ORDER BY a.pen_name";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, followerId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			result.add(new FollowListVO(rs.getString(1)
					, rs.getString(2)
					, rs.getString(3)
					, rs.getString(4)
					, rs.getString(5)));
		}
		pstmt.close();
		rs.close();
		return result;
	}
	//���ƿ� �߰�
	public boolean addReaction(String userId, String writeNo) 
			throws SQLException {
		boolean result=false;
		
		String sql = "insert into reaction values(?,?,sysdate)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);

		conn.commit();
		return result;
	} 
	//���ƿ� ����
	public boolean deleteReaction(String userId, String writeNo) 
			throws SQLException {
		boolean result=false;
		
		String sql = "delete from reaction where user_id = ? and write_no = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		

		conn.commit();
		return result;
	} 
	
	// ���ƿ� ��Ͽ��� ��ȸ
	//SELECT COUNT(user_id) FROM reaction WHERE user_id = ? AND write_no = ?;
	public boolean isReacted(String userId, String writeNo) 
			throws SQLException{
		boolean result = false;
		
		String sql = "SELECT COUNT(user_id) FROM reaction WHERE user_id = ? AND write_no = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, writeNo);
		ResultSet rs = pstmt.executeQuery();
	
		while(rs.next()) {
			result = (rs.getInt(1)==1);
		}
		pstmt.close();
		rs.close();
		return result;
	}
	
//	   //���ã�� �� ��� ��ȸ
//	   public Collection<BookmarkVO> getBookmarkList(String userId, String selectOpt) throws SQLException{
//	      Collection<BookmarkVO> result = new ArrayList();
//	      
//	      String sql = "select to_char(bm.bookmark_date,'yyyy-mm-dd'), s.suggestion_name, a.pen_name " + 
//	            "from bookmark bm, board bo, suggestion s, app_user a " + 
//	            "where bm.write_no = bo.write_no " + 
//	            "and bo.suggestion_code = s.suggestion_code " + 
//	            "and a.user_id = bo.writer_id " + 
//	            "and a.user_id = ?"+
//	            "order by ? desc";
//	      
//	      PreparedStatement pstmt = conn.prepareStatement(sql);
//	      pstmt.setString(1, userId);
//	      if (selectOpt.equals("date")) {
//	         pstmt.setString(2, "1");
//	      }else if(selectOpt.equals("word")){
//	         pstmt.setString(2, "2");
//	      }else {
//	         pstmt.setString(2, "3");
//	      }
//	      ResultSet rs = pstmt.executeQuery();
//	      
//	      while (rs.next()) {
//	         result.add(new BookmarkVO(rs.getString(1), rs.getString(2), rs.getString(3)));
//	      }
//	      pstmt.close();
//	      rs.close();
//	      
//	      return result;
//	   }
	   
	 //���ã�� �� ��� ��ȸ
	      public Collection<BoardVO> getBookmarkList(String userId, String selectOpt) throws SQLException{
	         Collection<BoardVO> result = new ArrayList();
	         
	         String sql = "select bo.write_no, to_char(bm.bookmark_date,'yyyy-mm-dd'), s.suggestion_name, a.pen_name " + 
	               "from bookmark bm, board bo, suggestion s, app_user a " + 
	               "where bm.write_no = bo.write_no " + 
	               "and bo.suggestion_code = s.suggestion_code " + 
	               "and a.user_id = bo.writer_id  " + 
	               "and bm.USER_ID = ? " + 
	               "order by ? desc";
	         
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, userId);
	         if (selectOpt.equals("date")) {
	            pstmt.setString(2, "1");
	         }else if(selectOpt.equals("word")){
	            pstmt.setString(2, "2");
	         }else {
	            pstmt.setString(2, "3");
	         }
	         ResultSet rs = pstmt.executeQuery();
	         
	         while (rs.next()) {
	            result.add(new BoardVO(rs.getString(1), rs.getDate(2), rs.getString(4),rs.getString(3)));
	         }
	         
	         pstmt.close();
	         rs.close();
	         
	         return result;
	      }
	      
	    /**
	     * ���ã�� ���� ��ȸ
	     * SELECT * FROM bookmark WHERE user_id='test1' AND write_no='6';
	     * */
	  	public boolean isBookmarked(String userId, String writeNo) 
				throws SQLException {
			boolean result=false;
			
			String sql = "SELECT count(user_id) FROM bookmark WHERE user_id=? AND write_no=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, writeNo);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				result = (rs.getInt(1)==1);
			}
			pstmt.close();
			rs.close();
			return result;
		}   
	      
	  	/**
	  	 * ���ƿ� �� ���� ��ȸ
	  	 * SELECT count(*) FROM reaction WHERE write_no = '1';
	  	 * */
	  	public int countReactions(String writeNo) 
				throws SQLException {
			int cnt=0;
			
			String sql = "SELECT count(*) FROM reaction WHERE write_no = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writeNo);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				cnt = rs.getInt(1);
			}
			pstmt.close();
			rs.close();
			return cnt;
		}  
}