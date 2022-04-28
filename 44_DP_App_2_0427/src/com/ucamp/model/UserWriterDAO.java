package com.ucamp.model;

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
		conn = DriverManager.getConnection(url, id, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("dbms OK");
	}
	
	/**방명록 리스트*/
	public Collection<UserWriter> getUserWriters(){
		Collection<UserWriter> list=new ArrayList();
		try {
			Statement stmt=conn.createStatement();
			String sql="select user_writer_no, user_id, writer_name,  contents, writer_date "
					+ "from user_writer";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new UserWriter(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean addWriter(String id, String name, String pw, String contents) {
		boolean result=false;
		String sql="insert into user_writer(user_writer_no, "
				+ "user_id, writer_name, writer_pw, contents, writer_date) " + 
				"values (user_writer_seq.nextval, ?,?, ?,?, sysdate)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setString(4, contents);
			int num=pstmt.executeUpdate();
			result=(num==1);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
}
