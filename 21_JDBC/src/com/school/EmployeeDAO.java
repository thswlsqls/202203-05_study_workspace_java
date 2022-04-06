package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
	
	/**모든 사원의 사번, 이름, 급여를 확인
	 * sql= SELECT 
	 * 			employee_id
	 * 			, first_name || last_name
	 * 			, salary
	 * 		FROM employees
	 * -레코드 갯수가 Collection 여부, 컬럼 갯수-3가 VO 여부 체크
	 * @throws SQLException 
	 * */
	public Collection<EmployeeVO> getEmployees() throws SQLException{
		Collection<EmployeeVO> list=new ArrayList<EmployeeVO>();
		
		Statement stmt=conn.createStatement();
		String sql = "SELECT"
				+ "	employee_id"
				+ ", first_name || last_name"
				+ ", salary "
				+ "FROM employees";	
		
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			list.add(new EmployeeVO(rs.getInt(1)
									, rs.getString(2)
									, rs.getFloat(3)));
		}
		rs.close();
		stmt.close();
		return list; //이건 나중에 구현부 수정할때 조심
	}
	
	/**특정 부서의 사원 정보(사번, 이름, 급여)등을 확인
	 * SELECT
	   	e.employee_id
	   	, e.first_name || e.last_name
	   	, e.salary
	   	, d.department_id
	   FROM employees e, departments d
	   WHERE e.department_id = d.department_id
	   AND department_name = 'IT';
	   컬럼 - 4, 1 VO
	 * @throws SQLException 
	 * */
	public Collection<EmployeeVO> getEmployees(String departmentName) throws SQLException{
		Collection<EmployeeVO> list=new ArrayList<EmployeeVO>();
		
		String sql="SELECT\r\n" + 
				"  e.employee_id\r\n" + 
				"  , e.first_name || e.last_name\r\n" + 
				"  , e.salary\r\n" + 
				"  , d.department_id\r\n" + 
				"FROM employees e, departments d\r\n" + 
				"WHERE e.department_id = d.department_id\r\n" + 
				"AND department_name = ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, departmentName); // 문자열
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			list.add(new EmployeeVO(rs.getInt(1)
									, rs.getString(2)
									, rs.getFloat(3)
									, rs.getInt(4)
									, departmentName));
		}
		rs.close();
		pstmt.close();
		return list;
	}

	/**우리 회사의 최대 금액, 최소 급여, 그 급여 차이 확인
	 * @throws SQLException */
	public float[] getSalaryData() throws SQLException {
		float[] s = null;
		
		String sql = "SELECT\r\n" + 
				"  MAX(salary)\r\n" + 
				"  , MIN(salary)\r\n" + 
				"  , MAX(salary) - MIN(salary)\r\n" + 
				"FROM employees";
		
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		if(rs.next()) { // 결과가 한개 레코드일 경우, while쓰지 마세요.
			s = new float[3]; 
			s[0] = rs.getFloat(1);
			s[1] = rs.getFloat(2);
			s[2] = rs.getFloat(3);
		}else {
			System.out.println("레코드가 없습니다.");
		}
		
		return s;
	}
	
//	public Collection<Float> getSalaryData(){};
	
	public Map<String, Float> getSalaryDataAsMap() throws SQLException{
		Map<String, Float> m = null;
		
		String sql = "SELECT\r\n" + 
				"  MAX(salary)\r\n" + 
				"  , MIN(salary)\r\n" + 
				"  , MAX(salary) - MIN(salary)\r\n" + 
				"FROM employees";
		
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		if(rs.next()) { // 결과가 한개 레코드일 경우, while쓰지 마세요.
			m = new LinkedHashMap<String, Float>();
			m.put("최대급여", rs.getFloat(1));
			m.put("최소급여", rs.getFloat(2));
			m.put("최대최소차액", rs.getFloat(3));
		}else {
			System.out.println("레코드가 없습니다.");
		}
		
		return m;
	}
	
//	public SalaryVO getSalaryData(){};
	
	/**특정사원(번호)의 이름, 급여를 확인
	 * @throws SQLException */

	public EmployeeVO getEmployee(int employeeId) throws SQLException {
		EmployeeVO v=null;
		
		String sql = "SELECT" + 
				"  employee_id" + 
				"  , first_name || last_name" + 
				"  , salary " + 
				"FROM employees " + 
				"WHERE employee_id = ?";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, employeeId);
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			v = new EmployeeVO(employeeId
					, rs.getString(2)
					, rs.getFloat(3));
		}
//		else {
//			System.out.println("레코드가 없습니다.");
//		} -> sql문이 잘못 작성된 경우, SQLException에서 확인할 수 있을 것이다.
		
		return v;
	}
	
	/** 회원 정보를 입력(가입)
	 * INSERT INTO user_data
		(user_id, name, point,  in_date) 
	   VALUES
		(1, '김사람', 1, sysdate);
	 * 입력값 - 3개
	 * @throws SQLException 
	 * */
	public boolean addUser(String userId, String name, int point) throws SQLException {
		boolean result=false;
		String sql="INSERT INTO user_data" + 
				"	(user_id, name, point,  in_date)" + 
				"	VALUES" + 
				"	(?, ?, ?, sysdate)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,  userId);
		pstmt.setString(2,  name);
		pstmt.setInt(3,  point);
		int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
//		if(num == 1) result=true;
		result = (num ==1);
		return result;
	}
	/**특정 회원의 포인트를 기존 포인트에 15를 추가
	 * @throws SQLException */

	public boolean setUserPoint(int addPoint, String userId) throws SQLException {
		boolean result=false;
		
		String sql = "UPDATE user_data" + 
				"	SET point = point + ?" + 
				"	WHERE user_id = ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,  addPoint);
		pstmt.setString(2,  userId);
		int num=pstmt.executeUpdate();	
		result = (num ==1);
		return result;
	}
	
	/**특정 회원의 정보를 삭제
	 * @throws SQLException */
	public boolean removeUser(String userId) throws SQLException {
		boolean result=false;
		
		String sql = "DELETE" + 
				"	FROM user_data" + 
				"	WHERE user_id = ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,  userId);
		int num=pstmt.executeUpdate();	
		result = (num ==1);
		return result;
	}
	
	
	

	
}
