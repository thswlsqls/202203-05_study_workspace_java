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
	
	/**-- 5. 수강신청 테이블에서 
	 * 		특정일(1998년 3월 1일)에서 특정일(3월3일) 사이에 수강신청 한 
	 * 		강좌번호, 학생번호, 수강신청일을 검색하시오.
	 * @throws SQLException 
	 * */
	public Collection<EnrollmentVO> getEnrollments(String startDate, String endDate) throws SQLException {
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
	 * -- 20. 수강신청한 과목들 중에서 
	 * 		    최고 점수를 받은 학생들의 정보를 조회하시오.
	 * */
	public Collection<EnrollmentVO> getHighestScoredScodes() 
			throws SQLException {
		Collection<EnrollmentVO> list = new ArrayList();
		String sql = 
				"SELECT" + 
				"   scode" + 
				"   , lcode" + 
				" FROM" + 
				"  enrollments" + 
				" WHERE (lcode, grade) IN" + 
				"  (" + 
				"    SELECT" + 
				"      lcode" + 
				"      , max(grade)" + 
				"    FROM enrollments" + 
				"    GROUP BY lcode" + 
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

