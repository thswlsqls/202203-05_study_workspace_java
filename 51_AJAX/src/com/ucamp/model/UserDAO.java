package com.ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private Connection conn;
	public UserDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver loading ok");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("2. DBMS 연결 ok");
	}
	
	/**로그인 select name from user_list where user_id = 'korea' and pw = '1234'*/
	public String login(String userId, String pw) {
		String name = "";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("select name from user_list where user_id = ? and pw = ?");
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				name = rs.getString(1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return name;
	}

	/**회원가입 insert into user_list(user_id, pw, name, in_date) valuse('lee', '1234', '이길동', sysdate)*/
	public boolean addUser(String userId, String pw, String name) {
		boolean result = false;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into user_list(user_id, pw, name, in_date) values(?, ?, ?, sysdate)");
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
		
			int num = pstmt.executeUpdate();
			
			result = (num>=1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**아이디체크 select count(user_id) from user_list where user_id ='hong'*/
	public int checkId(String userId) {
		int result = 0;
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select count(user_id) from user_list where user_id =?");
			pstmt.setString(1, userId);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
				result = rs.getInt(1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
