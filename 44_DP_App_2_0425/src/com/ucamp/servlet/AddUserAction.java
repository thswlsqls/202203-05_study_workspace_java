package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.MemberDAO;

public class AddUserAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String url="addUser.jsp";
		
		if(((MemberDAO)(request.getServletContext().getAttribute("dao"))).addUser(id,pw,name))
			url="login.jsp";
		
		return url;
	}

}
