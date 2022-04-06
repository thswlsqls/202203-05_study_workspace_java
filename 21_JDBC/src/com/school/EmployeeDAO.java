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
	
	/**��� ����� ���, �̸�, �޿��� Ȯ��
	 * sql= SELECT 
	 * 			employee_id
	 * 			, first_name || last_name
	 * 			, salary
	 * 		FROM employees
	 * -���ڵ� ������ Collection ����, �÷� ����-3�� VO ���� üũ
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
		return list; //�̰� ���߿� ������ �����Ҷ� ����
	}
	
	/**Ư�� �μ��� ��� ����(���, �̸�, �޿�)���� Ȯ��
	 * SELECT
	   	e.employee_id
	   	, e.first_name || e.last_name
	   	, e.salary
	   	, d.department_id
	   FROM employees e, departments d
	   WHERE e.department_id = d.department_id
	   AND department_name = 'IT';
	   �÷� - 4, 1 VO
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
		pstmt.setString(1, departmentName); // ���ڿ�
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

	/**�츮 ȸ���� �ִ� �ݾ�, �ּ� �޿�, �� �޿� ���� Ȯ��
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
		
		if(rs.next()) { // ����� �Ѱ� ���ڵ��� ���, while���� ������.
			s = new float[3]; 
			s[0] = rs.getFloat(1);
			s[1] = rs.getFloat(2);
			s[2] = rs.getFloat(3);
		}else {
			System.out.println("���ڵ尡 �����ϴ�.");
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
		
		if(rs.next()) { // ����� �Ѱ� ���ڵ��� ���, while���� ������.
			m = new LinkedHashMap<String, Float>();
			m.put("�ִ�޿�", rs.getFloat(1));
			m.put("�ּұ޿�", rs.getFloat(2));
			m.put("�ִ��ּ�����", rs.getFloat(3));
		}else {
			System.out.println("���ڵ尡 �����ϴ�.");
		}
		
		return m;
	}
	
//	public SalaryVO getSalaryData(){};
	
	/**Ư�����(��ȣ)�� �̸�, �޿��� Ȯ��
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
//			System.out.println("���ڵ尡 �����ϴ�.");
//		} -> sql���� �߸� �ۼ��� ���, SQLException���� Ȯ���� �� ���� ���̴�.
		
		return v;
	}
	
	/** ȸ�� ������ �Է�(����)
	 * INSERT INTO user_data
		(user_id, name, point,  in_date) 
	   VALUES
		(1, '����', 1, sysdate);
	 * �Է°� - 3��
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
		int num=pstmt.executeUpdate();	// ó�� ����� ���ڵ� ������ ����
//		if(num == 1) result=true;
		result = (num ==1);
		return result;
	}
	/**Ư�� ȸ���� ����Ʈ�� ���� ����Ʈ�� 15�� �߰�
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
	
	/**Ư�� ȸ���� ������ ����
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
