package com.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class LectureDAO {
	private Connection conn;
	public LectureDAO() throws ClassNotFoundException, SQLException {
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
	
	/**
	 * -- 6. ���� ���̺��� 
	 * 		�����̸��� Ư�� �ܾ �����ϴ� ������ 
	 * 		���¹�ȣ, �����̸�, ��米��, ���ǽð����� �˻��Ͻÿ�.
	 * */
	public Collection<LectureVO> getLectures(String includedString) 
			throws SQLException{
		Collection<LectureVO> list = new ArrayList<LectureVO>();
		String sql = 
				"SELECT" + 
				"  lcode" + 
				"  , lname" + 
				"  , hours" + 
				"  , instructor" + 
				" FROM" + 
				"  lectures" + 
				" WHERE " + 
				"  lname LIKE ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+includedString+"%");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			list.add(new LectureVO(rs.getString(1)
									, rs.getString(2)
									, rs.getInt(3)
									, rs.getString(4)));
		}
		return list;
	}
}
