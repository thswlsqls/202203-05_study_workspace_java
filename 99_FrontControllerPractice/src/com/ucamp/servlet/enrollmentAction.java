package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.schoolDAO;

public class enrollmentAction implements Action {

	@Override
	public String action(HttpServletRequest request){
		String url = "lectures.jsp";
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String lcode = request.getParameter("lcode");
		String name = (String)session.getAttribute("name");
		try {
			if (new schoolDAO().setEnrollment(id, lcode)) {
				url = "studentsMain.jsp";
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		return url;
	}

}
