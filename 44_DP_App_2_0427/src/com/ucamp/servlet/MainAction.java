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
		//�����Ǵ� ����Ʈ ������ �Է��� ������ �ֱ� ������ ������ �ε� �Ҷ� ���� DB���� �ҷ����� �߿�
		//Collection<Department> list=((MemberDAO)(request.getServletContext()
		//		                                    .getAttribute("dao"))).getDepartments();
		
		//Collection<UserWriter> list=new UserWriterDAO().getUserWriters();
		request.setAttribute("list", new UserWriterDAO().getUserWriters());
		return "main.jsp";
	}

}
