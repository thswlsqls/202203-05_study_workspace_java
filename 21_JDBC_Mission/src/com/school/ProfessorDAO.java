package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {
	private Connection conn;
	public ProfessorDAO() throws ClassNotFoundException, SQLException {
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
	 * -- 37.'HanOh' ������ ������ 'assistant professor'���� 'associate professor'�� �����Ͻÿ�.
-	 *			- ��, ������ȭ�鿡 ������ ����� ����� ǥ���Ͻÿ�. �޿��� 500000 �߰�
	 * */
	public boolean setProfessor(String updatePosition, float addSalary) 
			throws SQLException {
		boolean result = false;
		
		String sql = 
				"UPDATE professors p" + 
				" SET p.position = ?"
				+ "	, p.salary=salary+?" + 
				" WHERE p.pname = 'HanOh'";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, updatePosition);
		pstmt.setFloat(2, addSalary);
		int num=pstmt.executeUpdate();	
		result = (num ==1);
		return result;
	}
	
}
