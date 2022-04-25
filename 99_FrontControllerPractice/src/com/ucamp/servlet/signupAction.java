package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.schoolDAO;



public class signupAction implements Action {

	@Override
	public String action(HttpServletRequest request){
		String url = "signup.jsp";
		
		String scode = request.getParameter("scode");
		String sname = request.getParameter("sname");
		String department = request.getParameter("department");
		String year = request.getParameter("grade");
		String advisor = request.getParameter("advisor");
		String birthday = request.getParameter("year")+"."+request.getParameter("month")+"."+request.getParameter("day");
		System.out.println(birthday);
		try {
			if (new schoolDAO().setStudent(scode,sname,department,year,birthday,advisor)) {
				url  = "login.jsp";
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.getMessage();
		}

		return url;
	}

}
