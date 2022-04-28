package ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class MemberVisitDAO {
	private Connection conn;
	public MemberVisitDAO() {
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
	public Collection<MemberVisitVO> getWrite() {
		Collection<MemberVisitVO> result = new ArrayList();
		String sql = "select visitor_seq, member_id, contents, writer_date from member_visitor order by 1 desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while (rs.next()) {
				
				result.add(new MemberVisitVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
				
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	public boolean addWrite(String id, String writePw, String contents) {
		boolean result = false;
		
		String sql = "insert into member_visitor values(mem_visi_seq.nextVal, ?,?,?,sysdate)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, writePw);
			pstmt.setString(3, contents);
			int num = pstmt.executeUpdate();
			result = (num>=1);
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public boolean updateWrite(String contents, String id, String pw, String writeNo) {
		boolean result = false;
		
		String sql = "update member_visitor set contents=? where member_id = ? and pw = ? and visitor_seq = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, contents);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, writeNo);
			int num = pstmt.executeUpdate();
			result = (num>=1);
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public boolean deleteWrite(String writeNo,String pw) {
		boolean result = false;
		
		String sql = "delete from member_visitor where visitor_seq = ? and pw = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writeNo);
			pstmt.setString(2, pw);
			int num = pstmt.executeUpdate();
			result = (num>=1);
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
