package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeDAO {
	private Connection conn;
	public EmployeeDAO() throws ClassNotFoundException, SQLException {
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
	 * -- 40. 관리자 번호 및 해당 관리자에 속한 사원의 최저 급여, 인원수를 표시합니다. 
--      관리자를 알 수 없는 사원 및 최저 급여가 3000 이상인 그룹 제외시키고 
--      급여를 기준으로 출력 결과를 내림차순으로 정렬하시오.
	 */
	public Collection<int[]> getEmployeeDataOfManager(int maxSalary) 
			throws SQLException {
		Collection<int[]> c = new ArrayList<int[]>();
		String sql = "SELECT" + 
				"  manager_id" + 
				"  ,MIN(salary)" + 
				"  ,COUNT(employee_id)" + 
				" FROM" + 
				"  employees" + 
				" WHERE manager_id IS NOT NULL" + 
				" GROUP BY manager_id" + 
				" HAVING MIN(salary) <= ?" + 
				" ORDER BY MIN(salary)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, maxSalary);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			c.add(new int[]{rs.getInt(1), rs.getInt(2), rs.getInt(3)});
		}
		return c;
	}
	
	/**
	 * -- 40. 특정 관리자 번호 및 해당 관리자에 속한 사원의 최저 급여, 인원수를 표시합니다. 
--      관리자를 알 수 없는 사원 및 최저 급여가 특정액수 이상인 그룹 제외시키고 
--      급여를 기준으로 출력 결과를 내림차순으로 정렬하시오.
	 */
	public Map<String, Integer> getEmployeeDataOfManager(int ManagerId, int maxSalary) 
			throws SQLException {
		Map<String, Integer> m = null;
		String sql = "SELECT" + 
				"  manager_id" + 
				"  ,MIN(salary)" + 
				"  ,COUNT(employee_id)" + 
				" FROM" + 
				"  employees" + 
				" WHERE manager_id = ?" + 
				" GROUP BY manager_id" + 
				" HAVING MIN(salary) <= ?" + 
				" ORDER BY MIN(salary)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, ManagerId);
		pstmt.setInt(2, maxSalary);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			m = new LinkedHashMap<String, Integer>();
			m.put("관리자번호", rs.getInt(1));	
			m.put("사원최저급여", rs.getInt(2));
			m.put("사원인원수", rs.getInt(3));	
		}
		return m;
	}
}
