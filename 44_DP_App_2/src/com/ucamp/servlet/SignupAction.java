package com.ucamp.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.UserDAO;

public class SignupAction implements Action {
	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url="signup.jsp";
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String emailDomain=request.getParameter("emailDomain");
		String emailArr = email+emailDomain;
		String studentNumber=request.getParameter("studentNumber");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String hobbyList[]=request.getParameterValues("hobby");
		String hobby = "";
		for (String h : hobbyList) { 
			hobby += h; 
			hobby += " "; 
		}	
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		String birthday = year+"/"+month+"/"+day;
		try {
			if(((UserDAO)(request.getServletContext().getAttribute("dao"))).signup(id
									, pw
									, name
									, studentNumber
									, emailArr
									, phone
									, gender
									, hobby
									, birthday)) {
				url="login.jsp";
			}else { request.setAttribute("isRequestSuccess", "false"); }
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("emailDomain", emailDomain);
		request.setAttribute("studentNumber", studentNumber);
		request.setAttribute("phone", phone);
		request.setAttribute("gender", gender);
		request.setAttribute("hobbyList", hobbyList);
		request.setAttribute("birthday", year+"/"+month+"/"+day);
		return url;
	}
}
