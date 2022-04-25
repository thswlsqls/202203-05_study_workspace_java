package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.schoolDAO;

public class loginAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String id = request.getParameter("code");
		String name = request.getParameter("name");
		String url = "login.jsp";
		
		try {
			if (new schoolDAO().login(id,name).length() != 0) {
				if (id != null && id.length() ==8) {
					url = "studentsMain.jsp";
					request.setAttribute("name",name);
					request.setAttribute("id",id);
				}else if(id != null && id.length()==3) {
					url = "professorsMain.jsp";
					request.setAttribute("name",name);
					request.setAttribute("id",id);
				}			
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return url;
	}

}
