package ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private Connection conn;
	public MemberDAO() {
		String driver = "oracle.jdbc.OracleDriver"; 
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="hr";
		String password="hr";
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("2. dbms ¿¬°á ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("driver conn");
	}
	
	public boolean addUser(String memberId
			, String name
			, String pw
			, String gender
			, String hobby
			, String blood) {
		boolean result = false;
		String sql = "INSERT INTO member_list(member_id"
				+ ", name, pw, gender, hobby, blood)" + 
					 " VALUES(?, ?, ?, ?, ?, ?)"	;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setString(4, gender);
			pstmt.setString(5, hobby);
			pstmt.setString(6, blood);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String login(String memberId, String pw) {
		String name = null;
		String sql = "SELECT name FROM member_list WHERE member_id=? AND pw=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}

	public MemberVO getMember(String memberId) {
		MemberVO v = null;
		String sql = "SELECT member_id, name, pw, gender, hobby, blood" + 
				" FROM member_list WHERE member_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				v = new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3)
						, rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}
	
	public boolean isValidAddMemberId(String inputId) {
		boolean result = false;
		String sql = "SELECT count(member_id)"
				+ " FROM member_list"
				+ " WHERE member_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				result = (rs.getInt(1) >= 1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

}


