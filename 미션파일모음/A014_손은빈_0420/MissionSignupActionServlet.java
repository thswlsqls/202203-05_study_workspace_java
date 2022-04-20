package com.ucamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/missionSignupAction")
public class MissionSignupActionServlet extends HttpServlet {

	protected void service(HttpServletRequest request
						   , HttpServletResponse response) 
								   throws ServletException
								   , IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String emailDomain=request.getParameter("emailDomain");
		String studentNumber=request.getParameter("studentNumber");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String hobbyList[]=request.getParameterValues("hobby");
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		
		
		System.out.println(id 
							+ " " + pw
							+ " " + email
							+ " " + emailDomain
							+ " " + studentNumber
							+ " " + phone
							+ " " + gender		
							+ " " + Arrays.toString(hobbyList)	
							+ " " + year	
							+ " " + month
							+ " " + day
				);
	
		PrintWriter out=response.getWriter();
		out.println("아이디: "+ id + "<br>");
		out.println("비밀번호: "+ pw + "<br>");
		out.println("이름: "+ name + "<br>");
		out.println("이메일: "+ email + emailDomain + "<br>");
		out.println("학번: "+ studentNumber + "<br>");
		out.println("전화번호: "+ phone + "<br>"); 
		out.println("성별: "+ gender + "<br>");
		out.println("취미(목록): ");
		for (String s : hobbyList) { out.println(", "+ s); }
		out.println("<br>");
		out.println("생일: "+ year + "년 " + month + "월 " + day + "일 <br>");
		out.close();
		
	}
}
