package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

	/**방명록 작성*/
	public boolean addUserWriter(String userId, String writerName, String writerPw, String contents) {
		boolean result = false;
		
		String sql = "insert into user_writer(" + 
				"user_writer_no, user_id, writer_name, writer_pw, contents, writer_date)" + 
				" values (user_writer_seq.nextval, ?,?,?,?, sysdate)";
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
	
	/**방명록 목록 조회*/
	public Collection<UserWriterVO> getUserWriterList() {
		Collection<UserWriterVO> list = new ArrayList<UserWriterVO>();
		String sql = "SELECT user_writer_no, writer_pw, contents, writer_date, user_id, writer_name" + 
					 " FROM user_writer ORDER BY user_writer_no";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new UserWriterVO(rs.getInt(1)
										, rs.getString(2)
										, rs.getString(3)
										, rs.getDate(4)
										, rs.getString(5)
										, rs.getString(6)));
			}
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	/**특정 방명록 조회*/
	public UserWriterVO getUserWriter(String userWriterNo) {
		UserWriterVO v = null;
		String sql = "SELECT user_writer_no, writer_pw, contents, writer_date, user_id, writer_name"
				+ " FROM user_writer WHERE user_writer_no=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userWriterNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				v = new UserWriterVO(rs.getInt(1)
								   , rs.getString(2)
								   , rs.getString(3)
								   , rs.getDate(4)
								   , rs.getString(5)
								   ,rs.getString(6));
			}
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return v;
	}
	
	/**특정 방명록 글비밀번호 조회*/
	public String getWriterPw(String userWriterNo) {
		String writerPw = null;
		String sql = "SELECT writer_pw"
				+ " FROM user_writer WHERE user_writer_no=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userWriterNo);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				writerPw = rs.getString(1);
			}
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return writerPw;
	}
	
	/**특정 방명록 수정*/
	public boolean updateWriter(String userWriterNo, String contents) {
		boolean result = false;
		String sql = "UPDATE user_writer SET contents=?"
				+ " WHERE user_writer_no=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, contents);
			pstmt.setString(2, userWriterNo);
		
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return result;
	}
	
	/**특정 방명록 삭제*/
	public boolean deleteWriter(String userWriterNo) {
		boolean result = false;
		String sql = "DELETE FROM user_writer"
				+ " WHERE user_writer_no=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userWriterNo);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return result;
	}
}
