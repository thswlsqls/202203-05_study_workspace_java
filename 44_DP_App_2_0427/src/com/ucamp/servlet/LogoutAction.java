package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//������ �޸𸮸� Ȯ���� ����
		HttpSession session=request.getSession();
		if(session !=null) session.invalidate();//��� ����
		return "main.jsp";
	}

}
