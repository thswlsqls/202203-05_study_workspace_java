package com.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class EmotionDAO {
	private Connection conn;
	public EmotionDAO() {
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
	// 감정 8개 추출 / 새로고침
	public Collection<String> getEmotionName() throws SQLException {
		Collection<String> result = new ArrayList<String>();
//		String[] emotionCode = {"100","200","300","400","500","600","700","800"};
		String[] emotionCode = {"기쁨","행복","설렘","흥미","슬픔","분노","지루함","놀람"};
		int num = 0;
		while(num < 8) {
			String sql = "select emotion_name from (select * from emotion where main_emotion = ? order by dbms_random.random) " + 
					"where rownum = 1 ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emotionCode[num]);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				result.add(rs.getString(1));
			}
			pstmt.close();
			rs.close();
			num++;
		}
		return result;
	}
	
	// 감정 선택
	public boolean addEmpathy(String userId, String emotionCode) throws SQLException {
		boolean result=false;
		
		String sql = "insert into empathy values(EMPATHY_NO_SEQ.nextval,?,?,sysdate)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, emotionCode);
		int num = pstmt.executeUpdate();
		result=(num>=1);
		pstmt.close();	
		return result;
	}
	// 감정 트렌드 조회
	public Collection<String> getTrendEmotion() throws SQLException{
		Collection<String> result = new ArrayList<String>();
		String sql = "select emotion_name from (select e.emotion_name, count(*) " + 
				"from empathy p, emotion e " + 
				"where e.emotion_code = p.emotion_code " + 
				"group by emotion_name " + 
				"order by 2 desc) " + 
				"where rownum <= 3";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			result.add(rs.getString(1));	
		}
		stmt.close();
		rs.close();
		return result;
	}
	// 트렌드 글 상세 조회
	public Collection<BoardVO> getTrendWrite(String emotionCode) throws SQLException{
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
	//제시어 선택
	   public Collection<String> selectSuggestion(String userId) throws SQLException {
	      
	      Collection<String> result = new ArrayList<String>();
	      String sql = "select suggestion_name from "+
	      "(select distinct s.suggestion_name from app_user a, empathy p, emotion e, suggestion s "+
	      "where a.user_id = ? "+
	      "and a.user_id = p.user_id "+
	      "and p.emotion_code = e.emotion_code "+
	      "and e.emotion_code = s.emotion_code "+
	      "order by dbms_random.random) "+
	      "where rownum<=2";
	      
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      pstmt.setString(1, userId);
	      
	      ResultSet rs = pstmt.executeQuery();
	      while(rs.next()) {
	         result.add(rs.getString(1));
	      }
	      pstmt.close();
	      rs.close();
	      
	      return result;
	   }
}
