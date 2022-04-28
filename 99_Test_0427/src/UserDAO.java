

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	private Connection conn;
	public UserDAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1.driver loading OK");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(url, id, pw);}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("2.dbms OK");
	};
	
	/**회원가입*/
	public boolean addUser(String userId, String pw, String name) {
		boolean result = false;	
		String sql = "INSERT INTO user_list VALUES(?,?,?,sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return result;
	}
	
	/**로그인*/
	public String login(String userId, String pw) {
		String name = null;
		String sql = "SELECT name FROM user_list WHERE user_id=? AND pw=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				name = rs.getString(1);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	
	/**로그인한 유저정보 가져오기*/
	
}
