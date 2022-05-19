package com.ucamp.project.user;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

			/** 로그인
			 *  select pen_name from app_user where user_id = ? and user_pw = ? 
			 * @throws SQLException */		
			public String login(@Param("userId")String userId
					, @Param("userPw")String userPw) 
							throws SQLException;

		
			/** 회원가입
			 *  insert into app_user
			 *  (user_id, name, pen_name, user_pw, email, tel)
			 *   values(?,?,?,?,?,?)
			 * @throws SQLException */
			public boolean addUser(@Param("userId")String userId
					, @Param("name")String name
					, @Param("penName")String penName
					, @Param("userPw")String userPw
					, @Param("email")String email
					, @Param("tel")String tel) 
							throws SQLException;
				
			/** ID찾기
			 * select user_id from app_user where name = ? and email = ? 
			 * @throws SQLException */
			
			public String findId(@Param("name")String name
					, @Param("email")String email) 
							throws SQLException;
			
			/** --4. PW 찾기 
				select user_pw from app_user where name = ? and email = ?;
			 */
			public String findPw(@Param("name")String name
					, @Param("email")String email) throws SQLException;
			
			/**v2*/
//			/** ID찾기
//			 * select user_id from app_user where name = ? and email = ? 
//			 * @throws SQLException */
//			public String findId(@Param("name")String name
//			, @Param("email")String email) throws SQLException;
//			
//			/** --4. PW 찾기 
//				select user_pw from app_user where name = ? and email = ?;
//			 */
//			public String findPw(@Param("name")String name
//						, @Param("email")String email) 
//							throws SQLException;
			
			//아이디 중복체크 중복시 false 중복X true
			public boolean checkUserId(@Param("userId")String userId) throws SQLException;
			
			//필명 중복체크
			public boolean checkPenName(@Param("penName")String penName) throws SQLException;

			//인증번호 확인용
	        public String checkIdEmail(@Param("userId")String userId
	        		, @Param("email")String email) throws SQLException;
			
	        //인증번호와 아이디로 비밀번호 바꾸기
	        public boolean setTemporaryPw(@Param("userId")String userId
	        		, @Param("userPw")String userPw) throws SQLException;
	
}
