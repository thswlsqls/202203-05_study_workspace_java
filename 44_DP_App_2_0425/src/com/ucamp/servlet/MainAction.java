package com.ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.Department;
import com.ucamp.model.MemberDAO;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//공유되는 리스트를 누군가 입력해 놓을 수 있기 때문에 페이지 로딩 할 때마다 DB에서 불러오는 것이 중요함
		Collection<Department> list=((MemberDAO)(request.getServletContext().getAttribute("dao"))).getDepartments();
		request.setAttribute("list", list);
		return "main.jsp";
	}
}
