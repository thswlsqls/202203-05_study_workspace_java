package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		String url="login.jsp";
		//DAO
		try {			
			//if(new MemberDAO().login(id, pw).length() !=0) {
			MemberDAO dao=(MemberDAO)(request.getServletContext().getAttribute("dao"));
			String name=dao.login(id, pw);
			if(name !=null) {	
				//회원 전용 페이지 상태를 체크
				HttpSession session=request.getSession(true);//있으면 그대로 제공, 없을때만 새로 객체를 생성 전달
				session.setAttribute("loginOK", id); //로그인 상태를 체크 항목
				session.setAttribute("loginName", name);
				url="memberInfo.jsp";
			}
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return url;
	}

}
