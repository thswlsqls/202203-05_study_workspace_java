package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.schoolDAO;

public class registerLectureAction implements Action {

	@Override
	public String action(HttpServletRequest request){
		String url = "registerLecture.jsp";
		
		String lcode = request.getParameter("lcode");
		String lname = request.getParameter("lname");
		String hours = request.getParameter("hours");
		String room = request.getParameter("room");
		String capacity = request.getParameter("capacity");
		String persons = request.getParameter("persons");
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		try {
			if (new schoolDAO().setLectures(lcode,lname,hours,room,id,capacity,persons)) {
				url = "professorsMain.jsp";
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.getMessage();
		}
		
		return url;
	}

}
