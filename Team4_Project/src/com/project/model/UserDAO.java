package com.project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
		private Connection conn;		
		public UserDAO() {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.driver loading OK");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id = "hr";
			String pw = "hr";
			conn = DriverManager.getConnection(url, id, pw);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("dbms OK");
		

	}
		
/** �α���
 *  select pen_name from app_user where user_id = ? and user_pw = ? 
 * @throws SQLException */		
		public String login(String userId, String userPw) throws SQLException {
			
			String name = null;
			String sql = "select pen_name from app_user where user_id = ? and user_pw = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString(1);
			}
		
			rs.close();
			pstmt.close();
			
			return name;			
		}

		
		/** ȸ������
		 *  insert into app_user(user_id, name, pen_name, user_pw, email, tel) values(?,?,?,?,?,?)
		 * @throws SQLException */

		public boolean addUser(String userId, String name, String penName, String userPw, String email, String tel) throws SQLException {
				
			String sql = "insert into app_user(user_id, name, pen_name, user_pw, email, tel) values(?,?,?,?,?,?)";
			boolean result = false;
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, userId);
				pstmt.setString(2, name);
				pstmt.setString(3, penName);
				pstmt.setString(4, userPw);
				pstmt.setString(5, email);
				pstmt.setString(6, tel);
				
				int num = pstmt.executeUpdate();
				
				result = (num==1);
				
				return result;
			}
			
		/** IDã��
		 * select user_id from app_user where name = ? and email = ? 
		 * @throws SQLException */
		
		public String findId(String name, String email) throws SQLException {
			
			String result = null;
			String sql = "select user_id from app_user where name = ? and email = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) result = rs.getString(1);
						
			return result;
		}
		
		/** --4. PW ã�� 
			select user_pw from app_user where name = ? and email = ?;
		 */
		
		public String findPw(String name, String email) throws SQLException {
			
			String result = null;
			String sql = "select user_pw from app_user where name = ? and email = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) result = rs.getString(1);
						
			return result;
		}
		
		// UserDAO�� �߰�
		//���̵� �ߺ�üũ
		      public boolean checkUserId(String userId) throws SQLException {
		         boolean result = true;
		         
		         String sql="select user_id from app_user where user_id = ?";
		         PreparedStatement pstmt = conn.prepareStatement(sql);
		         pstmt.setString(1, userId);
		         ResultSet rs = pstmt.executeQuery();
		         
		         if (rs.next()) {
		            if (rs.getString(1)!=null) {
		               result = false;//�ߺ��Ǵ� Id�� ���� ��� false
		               
		            }
		            
		         }
		         
		         return result;
		      }
		      
		      //�ʸ� �ߺ�üũ
		      public boolean checkPenName(String penName) throws SQLException {
		         boolean result = true;
		         
		         String sql="select pen_name from app_user where pen_name = ?";
		         PreparedStatement pstmt = conn.prepareStatement(sql);
		         pstmt.setString(1, penName);
		         ResultSet rs = pstmt.executeQuery();
		         if (rs.next()) {
		            if (rs.getString(1)!=null) {
		               result = false;//�ߺ��Ǵ� �ʸ��� ���� ��� false
		            }
		            
		         }
		         
		         return result;
		      }
		      
      //������ȣ Ȯ�ο�
        public String checkIdEmail(String userId, String email) throws SQLException {
           String result = "";
           
           String sql = "select pen_name from app_user where user_id = ? and email = ?";
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, userId);
           pstmt.setString(2, email);
           ResultSet rs = pstmt.executeQuery();
           if(rs.next()) result = rs.getString(1);
                          
           return result;
          
        }
}
