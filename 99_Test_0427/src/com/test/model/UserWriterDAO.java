package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class UserWriterDAO {
	private Connection conn;
	public UserWriterDAO() {
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
	};
	
	/**방명록 작성하기*/
	public boolean addWriter(String userId, String writerName, String writerPw, String contents) {
		boolean result = false;
		
		String sql = "insert into user_writer(" + 
				"user_writer_no, user_id, writer_name, writer_pw, contents, writer_date)" + 
				" values (user_writer_seq.nextval, ?,?, ?,?, sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, writerName);
			pstmt.setString(3, writerPw);
			pstmt.setString(4, contents);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return result;
	}
	
	/**모든 방명록 목록 가져오기*/
	public Collection<UserWriterVO> getUserWriters(){
		Collection<UserWriterVO> list = null;
		
		
		return list;
	}
	
}
