package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.UserWriterDAO;

public class AddWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
//		HttpSession session=request.getSession();
		//String id=session.getAttribute("loginOK").toString();
		//String name=session.getAttribute("loginName").toString();
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pw=request.getParameter("pw");
		String contents=request.getParameter("contents");
		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(pw);
//		System.out.println(contents);
		
		new UserWriterDAO().addWriter(id, name, pw, contents);
		
		return "index.html";
	}

}
