package com.mission0421;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class UserDAO {

	private Connection conn;
	public UserDAO() throws ClassNotFoundException, SQLException {
		// 1. driver�� ���� DBMSȸ�翡�� ���� - �⺻ ���� x, �������� ����
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		
		// 2. DB���� ������ ���� �� ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";   
		String pw = "hr";	
		conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS ���� OK");
	}
	
	public boolean login(String id
						 , String password) throws SQLException {
		boolean result = false;
		
		Statement stmt=conn.createStatement();
		String sql = "SELECT id, password"
				+ "FROM users"
				+ "WHERE id = ? AND password = ?";
		
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next()) { // ��ȸ����� ������
			result = true;
		}else { // ������
			return result;
		}
		
		return result;
	}
	
	public boolean signup(UserVO v) {
		boolean result = false;
		
		String sql = "INSERT INTO "
				+ "	users "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  v.getId());
			pstmt.setString(2,  v.getPassword());
			pstmt.setString(3,  v.getName());
			pstmt.setString(4,  v.getStudentId());
			pstmt.setString(5,  v.getEmail());
			pstmt.setString(6,  v.getPhoneNumber());
			pstmt.setString(7,  v.getGender());
			pstmt.setString(8,  v.getHobby());
			pstmt.setString(9,  v.getBirthday());
			int num=pstmt.executeUpdate();	// ó�� ����� ���ڵ� ������ ����
			result = (num == 1);
		}catch(Exception e) {
			return result;
		}
			
		return result;
	}
	
	public boolean signup(String id
						  , String password
						  , String name
						  , String studentId
						  , String email
						  , String phoneNumber
						  , String gender
						  , String hobby
						  , String birthday) {
		boolean result = false;
		
		String sql = "INSERT INTO "
				+ "	users "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  id);
			pstmt.setString(2,  password);
			pstmt.setString(3,  name);
			pstmt.setString(4,  studentId);
			pstmt.setString(5,  email);
			pstmt.setString(6,  phoneNumber);
			pstmt.setString(7,  gender);
			pstmt.setString(8,  hobby);
			pstmt.setString(9, birthday);
			int num=pstmt.executeUpdate();	// ó�� ����� ���ڵ� ������ ����
			result = (num == 1);
		}catch(Exception e) {
			return result;
		}
		
		return result;
	}
	
}






