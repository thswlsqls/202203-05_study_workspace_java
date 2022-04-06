package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class SchoolDAO {
	private Connection conn;
	public SchoolDAO() throws ClassNotFoundException, SQLException {
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
	
	/**
	 * -- 15. Ư�� ������� ���Ǹ� �����ϴ� 
	 * 		    ������, �� ������ ������û �� �л����� �а�, �̸�, ������ �˻��Ͻÿ�.
	 * */
	public Collection<SchoolVO> getSchoolDatas(String lname) 
			throws SQLException{
		Collection<SchoolVO> list = new ArrayList();
		String sql = 
				"SELECT" + 
				"  p.pname" + 
				"  , s.department" + 
				"  , s.sname" + 
				"  , e.grade" + 
				" FROM " + 
				"  professors p, students s"
				+ ", enrollments e, lectures l" + 
				" WHERE s.scode = e.scode" + 
				" AND e.lcode = l.lcode" + 
				" AND l.instructor = p.pcode" + 
				" AND l.lname = ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, lname);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			list.add(new SchoolVO(rs.getString(1)
									, rs.getString(2)
									, rs.getString(3)
									, rs.getFloat(4)));
		}
		return list;
	}
}