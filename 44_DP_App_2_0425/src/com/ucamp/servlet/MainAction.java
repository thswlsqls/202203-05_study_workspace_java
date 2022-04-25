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
		//�����Ǵ� ����Ʈ�� ������ �Է��� ���� �� �ֱ� ������ ������ �ε� �� ������ DB���� �ҷ����� ���� �߿���
		Collection<Department> list=((MemberDAO)(request.getServletContext().getAttribute("dao"))).getDepartments();
		request.setAttribute("list", list);
		return "main.jsp";
	}
}
