package com.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class WriterDAO {

	private Connection conn;
	public WriterDAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1.driver loading OK");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(url, id, pw);}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("2.dbms OK");
	}

	   /** 게시글작성
	    * insert into board(write_no, contents, write_date, share_status, writer_id, suggestion_code)
	values(write_no_seq.nextval, ?, sysdate, '전체', ?, ?)
	    * @throws SQLException */
	   
	   public boolean diaryWrite(String contents, String writer_id, String suggestion_code) 
			   throws SQLException {
	      
	      boolean result = false;
	      String sql = "insert into board(write_no, contents, write_date, share_status, writer_id, suggestion_code) "
	            + "values(write_no_seq.nextval, ?, sysdate, '전체', ?, ?)";
	      
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, contents);
	      pstmt.setString(2, writer_id);
	      pstmt.setString(3, suggestion_code);
	   
	      int num = pstmt.executeUpdate();
	      result = (num==1);
	      
	      conn.commit();
	      return result;
	   }
	   
	   /** 게시글수정
	    * update board set contents = ? where writer_id = ? and write_no = ?
	    * @throws SQLException */
	   
	   public boolean diaryModify( String writer_id, String write_no, String contents) 
			   throws SQLException {
	      boolean result = false;
	      String sql = "update board set contents = ? where writer_id = ? and write_no = ?";
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, contents);
	      pstmt.setString(2, writer_id);
	      pstmt.setString(3, write_no);
	      
	      int num = pstmt.executeUpdate();
	      result=(num==1);
	      
	      //conn.commit();
	      return result;
	   }
	
	/**게시글 삭제
	 * delete from board where writer_id = ? and write_no = ?;
	 *  */
   public boolean diaryRemove( String writer_id, String write_no) throws SQLException {
	      boolean result = false;
	      String sql = "delete from board where writer_id = ? and write_no = ?";
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, writer_id);
	      pstmt.setString(2, write_no);
	      
	      int num = pstmt.executeUpdate();
	      result=(num==1);
	      
	      conn.commit();
	      return result;
	   }
	   
	/**게시글 조회
	 * select s.suggestion_name, b.contents, a.pen_name, b.write_date, e.emotion_code
		from app_user a, board b, suggestion s, emotion e
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code and e.emotion_code = s.emotion_code
		and e.emotion_code = ? ;
	 *  */
	public Collection<BoardVO> getHomeBoardList(String emotionCode) {
		Collection<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select s.suggestion_name"
				+ ", b.contents"
				+ ", a.pen_name"
				+ ", b.write_date"
				+ ", e.emotion_code" + 
				" from app_user a, board b, suggestion s, emotion e" + 
				" where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code and e.emotion_code = s.emotion_code" + 
				" and e.emotion_code = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emotionCode);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new BoardVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
   
	/**공유상태 설정 
	 * update board set share_status = ? where write_no = ? and writer_id = ?;
	 * */
   public boolean setShareStatus(String shareStatus, String writer_no, String write_id) throws SQLException {
	      boolean result = false;
	      String sql = "update board set share_status = ? where write_no = ? and writer_id = ?";
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, shareStatus);
	      pstmt.setString(2, writer_no);
	      pstmt.setString(3, write_id);
	      
	      int num = pstmt.executeUpdate();
	      result=(num==1);
	      
	      conn.commit();
	      return result;
	   }
	   
	/**새로운 게시물 목록 조회 
	 * select s.suggestion_name, b.contents, a.pen_name, b.write_date
		from app_user a, board b, suggestion s 
		where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code
		and rownum<=10
		order by b.write_date desc;
	 * */
	public Collection<BoardVO> getNewBoardList() {
		Collection<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "select s.suggestion_name"
				+ " , b.contents"
				+ " , a.pen_name"
				+ " , b.write_date" + 
					" from app_user a, board b, suggestion s " + 
					" where b.writer_id = a.user_id and b.suggestion_code = s.suggestion_code" + 
					" and rownum<=10\r\n" + 
					" order by b.write_date desc";
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new BoardVO(rs.getString(1)
						, rs.getString(2)
						, rs.getString(3)
						, rs.getDate(4)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	   
	/**실시간 추천글 조회 
	 * 
	  SELECT (SElECT count(*) 
        FROM reaction 
        WHERE write_no = b.write_no) AS rCnt ,
       (SElECT count(*) 
        FROM bookmark 
        WHERE write_no = b.write_no) AS bmCnt ,
        b.write_no, b.contents, b.write_date, b.share_status, b.writer_id, b.suggestion_code
	    FROM board b, bookmark bm, reaction r
	    WHERE b.write_no = bm.write_no AND b.write_no = r.write_no AND rownum <= 10
	    ORDER BY b.write_date desc, rCnt, bmCnt desc;
	 * 
	 * */
	/**
	 * SELECT (SElECT count(*) 
        FROM reaction 
        WHERE write_no = b.write_no) AS rCnt ,
        b.write_no, b.contents, b.write_date, b.share_status, b.writer_id, b.suggestion_code
	    FROM board b, reaction r
	    WHERE b.write_no = r.write_no AND rownum <= 10
	    ORDER BY b.write_date, rCnt desc
	 * */
	public Collection<BoardVO> getNowRecommendedBoardList() {
		Collection<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "SELECT (SElECT count(*) " + 
				"        FROM reaction " + 
				"        WHERE write_no = b.write_no) AS rCnt ," + 
				"        b.write_no, b.contents, b.write_date, b.share_status, b.writer_id, b.suggestion_code" + 
				"	    FROM board b, reaction r" + 
				"	    WHERE b.write_no = r.write_no AND rownum <= 10" + 
				"	    ORDER BY b.write_date, rCnt desc";
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(6)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Collection<BoardVO> getNowRecommendedBoardList_witthBookmark() {
		Collection<BoardVO> list = new ArrayList<BoardVO>();
		String sql = "SELECT (SElECT count(*) \r\n" + 
				" FROM reaction \r\n" + 
				" WHERE write_no = b.write_no) AS rCnt, " + 
				" (SElECT count(*) " + 
				" FROM bookmark " + 
				" WHERE write_no = b.write_no) AS bmCnt, " + 
				" b.write_no"
				+ " , b.contents"
				+ " , b.write_date"
				+ " , b.share_status"
				+ " , b.writer_id"
				+ " , b.suggestion_code" + 
					" FROM board b, bookmark bm, reaction r\r\n" + 
					" WHERE b.write_no = bm.write_no AND b.write_no = r.write_no AND rownum <= 10\r\n" + 
					" ORDER BY b.write_date desc, rCnt, bmCnt desc";
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new BoardVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)
						, rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
