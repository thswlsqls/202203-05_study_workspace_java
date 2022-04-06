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
	 * -- 15. 특정 과목명의 강의를 강의하는 
	 * 		    교수명, 이 과목을 수강신청 한 학생들의 학과, 이름, 성적을 검색하시오.
	 * 
	 * */
	public Collection<SchoolVO> getSchoolDatas(String lname) throws SQLException{
		Collection<SchoolVO> list = new ArrayList();
		
		String sql = 
				"SELECT\r\n" + 
				"  p.pname\r\n" + 
				"  , s.department\r\n" + 
				"  , s.sname\r\n" + 
				"  , e.grade\r\n" + 
				"FROM \r\n" + 
				"  professors p, students s, enrollments e, lectures l\r\n" + 
				"WHERE s.scode = e.scode\r\n" + 
				"AND e.lcode = l.lcode\r\n" + 
				"AND l.instructor = p.pcode\r\n" + 
				"AND l.lname = ?";
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
