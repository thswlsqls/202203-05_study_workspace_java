package ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

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
	public String login(String id, String pw) {
		String result = "";
		String sql = "select name from member_list where member_id = ? and pw = ?";
		
		try {
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getString(1);
			}
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public boolean addUser(String id, String name, String pw, String gender, String hobby, String blood) {
		boolean result = false;
		
		String sql = "insert into member_list values(?,?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setString(4, gender);
			pstmt.setString(5, hobby);
			pstmt.setString(6, blood);
			int num = pstmt.executeUpdate();
			result = (num>=1);
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public Collection<MemberVO> getUserInfo(String id) {
		Collection<MemberVO> result = new ArrayList();
		String sql = "select member_id, name, gender, blood, hobby from member_list where member_id = ?";
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();	
			while (rs.next()) {
				
				result.add(new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));				
			}
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}

