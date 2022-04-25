package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.schoolDAO;

public class professorsignupAction implements Action {

	@Override
	public String action(HttpServletRequest request){
		String url = "professorSignup.jsp";
		
		String pcode = request.getParameter("pcode");
		String pname = request.getParameter("pname");
		String department = request.getParameter("department");
		String salary = request.getParameter("salary");
		String position = request.getParameter("position");
		String hiredate = request.getParameter("year")+"."+request.getParameter("month")+"."+request.getParameter("day");
		
		try {
			if(new schoolDAO().setProfessor(pcode,pname,department,hiredate,position,salary)) {
				url  = "login.jsp";
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return url;
	}

}
