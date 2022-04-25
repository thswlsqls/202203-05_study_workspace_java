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
//			if(new MemberDAO().login(id, pw).length() !=0) {
			MemberDAO dao=(MemberDAO)(request.getServletContext().getAttribute("dao"));
			if(dao.login(id, pw) != null) {
				// ȸ�� ���� ������ ���¸� üũ
				HttpSession session=request.getSession(true); //������ �״�� ����, �������� ���� ��ü�� ���� ����
				session.setAttribute("loginOK", id); // �α��� ���¸� üũ �׸�
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
