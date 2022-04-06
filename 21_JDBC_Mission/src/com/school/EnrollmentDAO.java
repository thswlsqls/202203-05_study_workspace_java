package com.school;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;


public class EnrollmentDAO {
	private Connection conn;
	public EnrollmentDAO() throws ClassNotFoundException, SQLException {
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
	
	/**-- 5. ������û ���̺��� 
	 * 		1998�� 3�� 1�Ͽ��� 3��3�� ���̿� ������û �� 
	 * 		���¹�ȣ, �л���ȣ, ������û���� �˻��Ͻÿ�.
	 * @throws SQLException 
	 * */
	public Collection<EnrollmentVO> getEnrollmentData(String startDate, String endDate) throws SQLException{
		Collection<EnrollmentVO> list = new ArrayList();
		
		String sql = 
				"SELECT" + 
				"  lcode" + 
				"  , scode" + 
				"  , edate" + 
				" FROM " + 
				"  enrollments" + 
				" WHERE edate BETWEEN ? AND ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, startDate);
		pstmt.setString(2, endDate);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			list.add(new EnrollmentVO(rs.getString(1)
									, rs.getString(2)
									, rs.getDate(3)));
		}
		
		return list;
	}
	
	/**
	 * -- 20. ������û�� ����� �߿��� 
	 * 		    �ְ� ������ ���� �л����� ������ ��ȸ�Ͻÿ�.
	 * @throws SQLException 
	 * 
	 * 
	 * */
	public Collection<EnrollmentVO> getHighestScoredScodes() throws SQLException{
		Collection<EnrollmentVO> list = new ArrayList();

		String sql = 
				"SELECT\r\n" + 
				"   scode\r\n" + 
				"   , lcode\r\n" + 
				"FROM\r\n" + 
				"  enrollments\r\n" + 
				"WHERE (lcode, grade) IN\r\n" + 
				"  (\r\n" + 
				"    SELECT\r\n" + 
				"      lcode\r\n" + 
				"      , max(grade)\r\n" + 
				"    FROM enrollments\r\n" + 
				"    GROUP BY lcode\r\n" + 
				"  )";
		
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			list.add(new EnrollmentVO(rs.getString(2)
					                  , rs.getString(1)));
		}
		
		return list;
	}
}
