package com.ucamp.servlet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.EnrollmentVO;
import com.ucamp.model.schoolDAO;

public class enrollmentUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
//		Collection<String> list = new ArrayList<String>();
		Collection<EnrollmentVO> VOlist = new ArrayList<EnrollmentVO>();
		
		HttpSession session = request.getSession();
		String url = "";
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
		if (id.length()==8) {
			url = "studentsMain.jsp";
		}else if(id.length()==3) {
			url = "professorsMain.jsp";
		}
		
		try {
//			list = new schoolDAO().getEnrollments(id);
			VOlist = new schoolDAO().getEnrollmentsByVO(id);
			
			if (VOlist.size() != 0 ) {
				request.setAttribute("enrollments", VOlist);
				url = "enrollments.jsp";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("name",name);
		request.setAttribute("id", id);
		
		return url;
	}

}
