package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.project.model.WriterDAO;

public class DiaryModifyUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String writeNo = request.getParameter("writeNo");
		System.out.println(writeNo);
		try {
			String[] emotion_name = new WriterDAO().getemotionName(writeNo);
			request.setAttribute("emotion_name", emotion_name[0]);
			request.setAttribute("contents", emotion_name[1]);
			request.setAttribute("writeNo", writeNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "diaryModify.jsp";
	}

}
