package ucamp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class VisitorDAO {
	private Connection conn;
	public VisitorDAO() {
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
	
	public Collection<VisitorVO> getVisitorList(){
		Collection<VisitorVO> list = new ArrayList<VisitorVO>();
		String sql = "SELECT visitor_seq, member_id, pw, contents, writer_date"
				+ " FROM member_visitor ORDER BY visitor_seq";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new VisitorVO(rs.getInt(1)
						, rs.getString(2)
						, rs.getString(3)
						, rs.getString(4)
						, rs.getDate(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public VisitorVO getVisitor(String visitorSeq) {
		VisitorVO v = null;
		String sql = "SELECT visitor_seq, member_id, pw, contents, writer_date " + 
					 "FROM member_visitor WHERE visitor_seq=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, visitorSeq);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				v = new VisitorVO(rs.getInt(1)
								, rs.getString(2)
								, rs.getString(3)
								, rs.getString(4)
								, rs.getDate(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}
	
	public boolean addVisitor(String memberId, String pw, String contents) {
		boolean result = false;
			
		String sql = "INSERT INTO member_visitor(visitor_seq, member_id, pw, contents, writer_date) " + 
					 "VALUES(mem_visi_seq.nextval, ?, ?, ?, sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, pw);
			pstmt.setString(3, contents);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean updateVisitor(String visitorSeq, String updateContents) {
		boolean result = false;
		String sql = "UPDATE member_visitor SET contents=? WHERE visitor_seq=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateContents);
			pstmt.setString(2, visitorSeq);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String getVisitorPw(String visitorSeq) {
		String pw = null;
		String sql = "SELECT pw "+ 
					 "FROM member_visitor WHERE visitor_seq=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, visitorSeq);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				pw = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pw;
	}
	
	public boolean deleteVisitor(String visitorSeq) {
		boolean result = false;
		String sql = "DELETE FROM member_visitor WHERE visitor_seq = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, visitorSeq);
			int num = pstmt.executeUpdate();
			result = (num==1);
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Collection<VisitorVO> getVisitorListById(String inputId){
		Collection<VisitorVO> list = new ArrayList<VisitorVO>();
		String sql = "SELECT visitor_seq, member_id, pw, contents, writer_date" + 
					 " FROM member_visitor WHERE member_id LIKE ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+inputId+"%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new VisitorVO(rs.getInt(1)
						, rs.getString(2)
						, rs.getString(3)
						, rs.getString(4)
						, rs.getDate(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
}















