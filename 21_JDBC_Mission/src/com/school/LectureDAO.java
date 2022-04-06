package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class LectureDAO {
	private Connection conn;
	public LectureDAO() throws ClassNotFoundException, SQLException {
		// 1. driver는 각각 DBMS회사에서 구현 - 기본 제공 x, 수동으로 제공
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		
		// 2. DB연결 서버의 정보 및 계정
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";	
		conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS 연결 OK");
	}
	
	/**
	 * -- 6. 강좌 테이블에서 
	 * 		강좌이름이 특정 단어를 포함하는 강좌의 
	 * 		강좌번호, 강좌이름, 담당교수, 강의시간수를 검색하시오.
	 * */
	public Collection<LectureVO> getLectures(String includedString) 
			throws SQLException{
		Collection<LectureVO> list = new ArrayList<LectureVO>();
		String sql = 
				"SELECT" + 
				"  lcode" + 
				"  , lname" + 
				"  , hours" + 
				"  , instructor" + 
				" FROM" + 
				"  lectures" + 
				" WHERE " + 
				"  lname LIKE ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+includedString+"%");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			list.add(new LectureVO(rs.getString(1)
									, rs.getString(2)
									, rs.getInt(3)
									, rs.getString(4)));
		}
		return list;
	}
}
