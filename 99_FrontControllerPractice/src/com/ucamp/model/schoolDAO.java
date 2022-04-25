package com.ucamp.model;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.sun.org.apache.bcel.internal.generic.Select;

public class schoolDAO {
	private Connection conn;
	public schoolDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr"; 
		
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DBMS ok.");
	}
	
	public boolean setStudent(String scode, String sname, String department,String year, String birthday, String advisor) throws SQLException {
		boolean result = false;
		
		String sql = "insert into students(scode,sname,department,year,birthday,advisor) "
				+ "values(?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, scode);
		pstmt.setString(2, sname);
		pstmt.setString(3, department);
		pstmt.setString(4, year);
		pstmt.setString(5, birthday);
		pstmt.setString(6, advisor);
		
		int num = pstmt.executeUpdate();
		if (num>=1) {
			result = true;
		}
		pstmt.close();
		
		return result;
	}

	public String login(String id, String name) throws SQLException {
		String result = "";
		String sql = "";
		if (id != null && id.length()==8) {
			sql = "select scode from students where scode = ? and sname = ?";
		}else if(id != null && id.length()==3) {
			sql = "select pcode from professors where pcode = ? and pname = ?";
		}
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			result = rs.getString(1);
		}
		pstmt.close();
		rs.close();
		return result;
	}
	
	public String getStudentsName(String id) throws SQLException {
		String result = "";
		String sql = "select sname from students where scode = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			result = rs.getString(1);
		}
		pstmt.close();
		rs.close();
		return result;
	}
	
	public String getprofessorsName(String id) throws SQLException {
		String result = "";
		String sql = "select pname from professors where pcode = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			result = rs.getString(1);
		}
		pstmt.close();
		rs.close();
		return result;
	}

	public Collection<String> getEnrollments(String id) throws SQLException {
		Collection<String> list = new ArrayList<String>();
		String sql = "";
		if (id != null && id.length()==8) {
			sql = "select lcode, scode, edate, grade from enrollments where scode = ?";
		}else if(id != null && id.length()==3) {
			sql = "select lcode, scode, edate, grade from enrollments "
					+ "where lcode in(select lcode from lectures where instructor = ?)";
		}
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(new String(rs.getString(1)+",  "+rs.getString(2)+",  "+rs.getString(3)+",  "+rs.getString(4)));
		}
		pstmt.close();
		rs.close();
		return list;
	}
	public Collection<EnrollmentVO> getEnrollmentsByVO(String id) throws SQLException {
		Collection<EnrollmentVO> list = new ArrayList<EnrollmentVO>();
		String sql = "";
		if (id != null && id.length()==8) {
			sql = "select lcode, scode, edate, grade from enrollments where scode = ?";
		}else if(id != null && id.length()==3) {
			sql = "select lcode, scode, edate, grade from enrollments "
					+ "where lcode in(select lcode from lectures where instructor = ?)";
		}
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			list.add(new EnrollmentVO(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4)));
		}
		pstmt.close();
		rs.close();
		return list;
	}

	public Collection<String> getLectures() throws SQLException {
		Collection<String> list = new ArrayList<String>();
		String sql = "select lcode, lname, hours, room, capacity, persons from lectures";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			list.add(rs.getString(1)+",  "+rs.getString(2)+",  "+rs.getString(3)+",  "+rs.getString(4)+",  "+rs.getString(5)+",  "+rs.getString(6));
			}
		stmt.close();
		rs.close();
		return list;
	}
	
	public Collection<LectureVO> getLecturesByVO() throws SQLException {
		Collection<LectureVO> list = new ArrayList<LectureVO>();
		String sql = "select lcode, lname, hours, room, capacity, persons from lectures";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			list.add(new LectureVO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
			}
		stmt.close();
		rs.close();
		return list;
	}

	public boolean setLectures(String lcode, String lname, String hours, String room, String id, String capacity,
			String persons) throws SQLException {
		boolean result = false;
		
		String sql = "insert into lectures(lcode,lname,hours,room,instructor,capacity,persons) "
				+ "values(?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, lcode);
		pstmt.setString(2, lname);
		pstmt.setString(3, hours);
		pstmt.setString(4, room);
		pstmt.setString(5, id);
		pstmt.setString(6, capacity);
		pstmt.setString(7, persons);
		
		int num = pstmt.executeUpdate();
		if (num>=1) {
			result = true;
		}
		pstmt.close();
		
		return result;
	}

	public boolean setEnrollment(String id, String lcode) throws SQLException {
		boolean result = false;
		
		String sql = "insert into enrollments(lcode, scode, edate) "
				+ "values(?,?,sysdate)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, lcode);
		pstmt.setString(2, id);
		int num = pstmt.executeUpdate();
		
		if (num>=1) {
			result = true;
		}
		pstmt.close();

		
		return result;
	}

	public boolean setProfessor(String pcode, String pname, String department, String hiredate, String position,
			String salary) throws SQLException {
		boolean result = false;
		
		String sql = "insert into professors(pcode,pname,department,hiredate,position,salary) "
				+ "values(?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, pcode);
		pstmt.setString(2, pname);
		pstmt.setString(3, department);
		pstmt.setString(4, hiredate);
		pstmt.setString(5, position);
		pstmt.setString(6, salary);
		
		int num = pstmt.executeUpdate();
		if (num>=1) {
			result = true;
		}
		pstmt.close();
		
		return result;
	}
	
}
