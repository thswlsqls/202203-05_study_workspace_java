package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// JavaBean = ���� �ڹ� �������� ����� �ʿ信 ���ؼ� ����.
public interface Action {
	// �������� ���� �ڵ带 ó���ϸ� Action�� ������ ������ ó���ϸ� �ǰ�, ��� �̵��� ������ �ּ�(String)
	String action(HttpServletRequest request) throws ServletException, IOException;
}



