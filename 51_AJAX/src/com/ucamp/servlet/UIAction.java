package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

public class UIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String cmd = request.getParameter("cmd");
		String url="";
		
		switch(cmd) {
		case "addUserUI" : url = "addUser.jsp"; break;
		case "addWriterUI" : url = "addWriter.jsp"; break;
		default : url = "login.jsp";
		}
	
		return url;
	}

}
