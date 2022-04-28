package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//서버의 메모리를 확실히 해제
		HttpSession session=request.getSession();
		if(session !=null) session.invalidate();//모두 해제
		return "main.jsp";
	}

}
