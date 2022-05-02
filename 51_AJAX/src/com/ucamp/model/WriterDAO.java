package com.ucamp.model;

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
	
	/**방명록 조회 select user_writer_no, contents, user_id, writer_date, writer_name from user_writer*/
	public Collection<Writer> getWriters(){
		Collection<Writer> list = new ArrayList<Writer>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select user_writer_no, contents, user_id, writer_name, writer_date from user_writer order by user_writer_no desc");
			
			while(rs.next()) {
				list.add(new Writer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public boolean addWriter(String contents, String userId, String password, String writerName) {
		
		boolean result = false;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into user_writer(user_writer_no, writer_pw, user_id, contents, writer_date, writer_name) values(user_writer_seq.nextval, ?,?,?,sysdate,?)");
			pstmt.setString(1, password);
			pstmt.setString(2, userId);
			pstmt.setString(3, contents);
			pstmt.setString(4, writerName);
		
			int num = pstmt.executeUpdate();
			
			result = (num>=1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	/**방명록 수정 update user_writer set contents = '123', writer_date = sysdate where user_writer_no = '26' user_id = 'korea' and writer_pw = '1234'*/
	public boolean updateContent(String contents,int writerNumber, String userId, String password) {
		boolean result = false;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("update user_writer set contents = ?, writer_date = sysdate where user_writer_no = ? and user_id = ? and writer_pw = ?");
			pstmt.setString(1, contents);
			pstmt.setInt(2, writerNumber);
			pstmt.setString(3, userId);
			pstmt.setString(4, password);
		
			int num = pstmt.executeUpdate();
			
			result = (num>=1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	public boolean removeWriter(int writerNumber, String userId, String password) {
boolean result = false;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from user_writer where user_writer_no=? and user_id=? and writer_pw=?");
			pstmt.setInt(1, writerNumber);
			pstmt.setString(2, userId);
			pstmt.setString(3, password);
		
			int num = pstmt.executeUpdate();
			
			result = (num>=1);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public Collection<Writer> searchWriter(String userId){
		Collection<Writer> list = new ArrayList<Writer>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("select user_writer_no, contents, user_id, writer_name, writer_date from user_writer where user_id = ? order by user_writer_no desc");
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Writer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
