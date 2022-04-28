package com.test.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	private Connection conn;
	public MemberDAO() {
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
	
	/**
	 * 1. ȸ�������� �Ͽ� DB�� ������ �� �ִ�.
	 * @throws SQLException 
	 * */
	public boolean addMember(String userId
							, String pw
							, String name
							, String phoneNumber
							, String gender
							, String hobby
							, Date birthday)  {
		boolean result = false;
		
		String sql = "INSERT INTO member(user_id, pw, name, phone_number, gender, hobby, birthday) VALUES(?, ?, ?, ?, ?, ?, ?)"; 
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, phoneNumber);
			pstmt.setString(5, gender);
			pstmt.setString(6, hobby);
			pstmt.setDate(7, birthday);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/***
	 * 2. �α���(DB�� ��)�Ͽ� ����� �������� �̵��� �� �ִ�. 
	 */
	public String login(String userId, String pw) {
		String name=null;
		String sql = "SELECT name FROM member WHERE user_id=? AND pw=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				name=rs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return name;
	}
}
