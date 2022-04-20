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
		out.println("���̵�: "+ id + "<br>");
		out.println("��й�ȣ: "+ pw + "<br>");
		out.println("�̸�: "+ name + "<br>");
		out.println("�̸���: "+ email + emailDomain + "<br>");
		out.println("�й�: "+ studentNumber + "<br>");
		out.println("��ȭ��ȣ: "+ phone + "<br>"); 
		out.println("����: "+ gender + "<br>");
		out.println("���(���): ");
		for (String s : hobbyList) { out.println(", "+ s); }
		out.println("<br>");
		out.println("����: "+ year + "�� " + month + "�� " + day + "�� <br>");
		out.close();
		
	}
}
