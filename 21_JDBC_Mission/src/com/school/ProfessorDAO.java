package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {
	private Connection conn;
	public ProfessorDAO() throws ClassNotFoundException, SQLException {
		// 1. driver는 각각 DBMS회사에서 구현 - 기본 제공 x, 수동으로 제공
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		
		// 2. DB연결 서버의 정보 및 계정
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";	
		conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS 연결 OK");
	}
	
	/**
	 * -- 37.'HanOh' 교수의 직급을 'assistant professor'에서 'associate professor'로 변경하시오.
-	 *			- 단, 수행결과화면에 변경한 행수의 결과를 표기하시오. 급여도 500000 추가
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
