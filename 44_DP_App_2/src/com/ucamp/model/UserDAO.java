package com.ucamp.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class UserDAO {
	private Connection conn;
	public UserDAO() {
		try {
		// 1. driver는 각각 DBMS회사에서 구현 - 기본 제공 x, 수동으로 제공
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		// 2. DB연결 서버의 정보 및 계정
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";   
		String pw = "hr";	
		conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS 연결 OK");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String login(String userId
						 , String password) throws SQLException {
		String result = "";	
		String sql = "SELECT name"
				+ " FROM users"
				+ " WHERE user_id=? AND password=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) { // 조회결과가 있으면
			result = rs.getString(1);
		}else { // 없으면
			return result;
		}	
		return result;
	}
	
	public boolean signup(UserVO v) {
		boolean result = false;
		
		String sql = "INSERT INTO "
				+ "	users "
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  v.getUserId());
			pstmt.setString(2,  v.getPassword());
			pstmt.setString(3,  v.getName());
			pstmt.setString(4,  v.getStudentId());
			pstmt.setString(5,  v.getEmail());
			pstmt.setString(6,  v.getPhoneNumber());
			pstmt.setString(7,  v.getGender());
			pstmt.setString(8,  v.getHobby());
			pstmt.setDate(9,  v.getBirthday());
			int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
			result = (num == 1);
		}catch(SQLException e) {
			return result;
		}
			
		return result;
	}
	
	public boolean signup(String userId
						  , String password
						  , String name
						  , String studentId
						  , String email
						  , String phoneNumber
						  , String gender
						  , String hobby
						  , Date birthday) throws SQLException {
		boolean result = false;
		
		String sql = "INSERT INTO"
				+ "	users(user_id, password, name, student_id, email, phone_number, gender, hobby, birthday)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  userId);
			pstmt.setString(2,  password);
			pstmt.setString(3,  name);
			pstmt.setString(4,  studentId);
			pstmt.setString(5,  email);
			pstmt.setString(6,  phoneNumber);
			pstmt.setString(7,  gender);
			pstmt.setString(8,  hobby);
			pstmt.setDate(9, birthday);
			int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
			result = (num == 1);
		}catch(Exception e) {
			System.out.println(e);
			return result;
		}		
		return result;
	}
	
	public UserVO getUser(String userId, String pw) throws SQLException {
		UserVO v = null;
		
		String sql = "SELECT "
				+ "	user_id"
				+ ", password"
				+ ", name"
				+ ", birthday"
				+ ", phone_number"
				+ ", email"
				+ ", gender"
				+ ", student_id"
				+ ", hobby"
				+ " FROM USERS"
				+ " WHERE user_id = ? AND password = ?";

		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,  userId);
		pstmt.setString(2,  pw);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			v = new UserVO(rs.getString(1)
						 , rs.getString(2)
						 , rs.getString(3)
						 , rs.getDate(4)
						 , rs.getString(5)
						 , rs.getString(6)
						 , rs.getString(7)
						 , rs.getString(8)
						 , rs.getString(9));
		}
		return v;
	}
	
	public Collection<GuestBookVO> getGuestBooks() throws SQLException{
		Collection<GuestBookVO> list = new ArrayList<GuestBookVO>();
		String sql = "SELECT "
				+ "guest_no"
				+ ", user_id"
				+ ", title"
				+ ", content"
				+ ", in_date" 
				+ " FROM guest_books";
//				+ " ORDER BY guest_no";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			list.add(new GuestBookVO(rs.getInt(1)
					               , rs.getString(2)
					               , rs.getString(3)
					               , rs.getString(4)
					               , rs.getDate(5)));
		}		
		return list;
	}
	
	public boolean addGuestBook(String userId, String title, String content) throws SQLException {
		boolean result = false;
		String sql = "INSERT INTO guest_books"
				+ "(guest_no, user_id, title, content, in_date)" 
				+ " VALUES(guest_seq.NEXTVAL, ?, ?, ?, sysdate)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  userId);
			pstmt.setString(2,  title);
			pstmt.setString(3,  content);
			
			int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
			result = (num == 1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public GuestBookVO getGuestBook(int guestNo) throws SQLException {
		GuestBookVO v = null; 
		String sql = "SELECT "
				+ "	guest_no"
				+ " , user_id"
				+ " , title"
				+ " , content"
				+ " , in_date" 
				+ " FROM guest_books"
				+ " WHERE guest_no=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,  guestNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			v = new GuestBookVO(rs.getInt(1)
								, rs.getString(2)
								, rs.getString(3)
								, rs.getString(4)
								, rs.getDate(5));
		}
		return v;
	}
	
	public boolean updateGuestBook(String updateTitle
			 , String updateContent
			 , int guestNo) throws SQLException {
		boolean result = false;
		String sql = "UPDATE guest_books "
		+"SET title=?, content=?, in_date=sysdate "
		+"WHERE guest_no=?";
		try {
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, updateTitle);
		pstmt.setString(2, updateContent);
		pstmt.setInt(3,guestNo);
		int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
		result = (num == 1);
		}catch(Exception e) {
		e.printStackTrace();
		}
		return result;
	}
	
	public boolean deleteGuestBook(int guestNo) throws SQLException {
		boolean result = false;
		String sql = "DELETE "
					+"FROM guest_books "
					+"WHERE guest_no=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,guestNo);
			int num=pstmt.executeUpdate();	// 처리 결과를 레코드 개수로 제공
			result = (num == 1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
