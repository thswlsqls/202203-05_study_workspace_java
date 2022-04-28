package com.ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class MemberDAO {
	
	private Connection conn;
	public MemberDAO() {
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
	
	/**부서 정보
	 * select department_id, department_name from departments*/
	public Collection<Department> getDepartments(){
		Collection<Department> list=new ArrayList();
		try {
			Statement stmt=conn.createStatement();
			String sql="select department_id, department_name from departments";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new Department(rs.getInt(1), rs.getString(2)));				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	/** 로그인 후 있으면 계정의 이름 확인, 없으면 null*/
	public String login(String id, String pw) throws SQLException {
		String result=null;
		String sql = "select name from user_list where user_id=? and pw=?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			result=rs.getString(1);
		}

		rs.close();
		pstmt.close();
		
		return result;
	}
	/**회원가입 - overloading*/
	public boolean addUser(String memberId, String pw, String name) {
		boolean result=false;
		String sql="insert into user_list values(?,?,?,sysdate)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			int num=pstmt.executeUpdate();
			result=(num==1);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean addUser(User u) {
		return addUser(u.getUserId(), u.getPw(), u.getName());
	}

}
