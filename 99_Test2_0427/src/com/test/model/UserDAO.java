package com.test.model;

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
	
	/**회원가입*/
	public boolean addUser(String userId, String pw, String name) {
		boolean result = false;
		
		String sql = "INSERT INTO user_list VALUES(?,?,?,sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**로그인*/
	public String login(String userId, String pw) {
		String name = null;
		String sql = "SELECT name FROM user_list WHERE user_id=? AND pw=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				name = rs.getString(1);
			}
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return name;
	}
	
	/**로그인 사용자 정보 조회*/
	public UserVO getUser(String userId) {
		UserVO v = null;
		
		String sql = "SELECT user_id, pw, name, in_date FROM user_list WHERE user_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				v = new UserVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4));
			}
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
		return v;
	}
	
	
}

