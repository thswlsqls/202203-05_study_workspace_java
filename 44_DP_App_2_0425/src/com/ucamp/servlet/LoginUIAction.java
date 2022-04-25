package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class LoginUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//화면 뿌리는 건 처리 내용이 없다.
		return "login.jsp";
	}

}
