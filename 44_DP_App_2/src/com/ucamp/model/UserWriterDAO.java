package com.ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class UserWriterDAO {

	private Connection conn;
	public UserWriterDAO() {
		try {
		// 1. driver�� ���� DBMSȸ�翡�� ���� - �⺻ ���� x, �������� ����
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		// 2. DB���� ������ ���� �� ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";   
		String pw = "hr";	
		conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS ���� OK");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** ���� ����Ʈ */
	public Collection<UserWriter> getUserWriters(){
		Collection<UserWriter> list=new ArrayList<UserWriter>();
//		private int writerNumber;
//		private String writerId;
//		private String writerName;
//		private String contents;
//		private String writerPw;
//		private String writerDate;
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT writer_no, writer_id, writer_name, contents, writer_date FROM user_writer";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new UserWriter(
						    rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5)
						));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}
	
}
