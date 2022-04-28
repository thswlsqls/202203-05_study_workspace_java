package com.ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.Department;
import com.ucamp.model.MemberDAO;
import com.ucamp.model.UserWriter;
import com.ucamp.model.UserWriterDAO;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//공유되는 리스트 누구가 입력해 놓을수 있기 때문에 페이지 로딩 할때 마다 DB에서 불러오는 중요
		//Collection<Department> list=((MemberDAO)(request.getServletContext()
		//		                                    .getAttribute("dao"))).getDepartments();
		
		//Collection<UserWriter> list=new UserWriterDAO().getUserWriters();
		request.setAttribute("list", new UserWriterDAO().getUserWriters());
		return "main.jsp";
	}

}
