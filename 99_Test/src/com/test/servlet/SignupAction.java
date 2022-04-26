package com.test.servlet;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.test.model.MemberDAO;

public class SignupAction implements Action {
	
	@Override
	public String action(HttpServletRequest request) throws SQLException, ClassNotFoundException {
		String url = "signup.jsp";
		
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String gender = request.getParameter("gender");
		String[] hobbyList = request.getParameterValues("hobby");
		String hobby = "";
		for (String h : hobbyList) {
			hobby += h;
			hobby += " ";
		}
//		int year = Integer.parseInt(request.getParameter("year"));
//		int month = Integer.parseInt(request.getParameter("month"));
//		int day = Integer.parseInt(request.getParameter("day"));
		
		String birthday = request.getParameter("year") +"."+request.getParameter("month")+"."+request.getParameter("day");
		
		System.out.println(userId +" "+pw+" "+name+" "+phoneNumber+" "+gender+" "+hobby+" "+birthday);
		
		try {
			if(((MemberDAO)(request.getServletContext().getAttribute("mDAO")))
					.addMember(userId, pw, name, phoneNumber, gender, hobby, birthday)) {
				url = "login.jsp";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
