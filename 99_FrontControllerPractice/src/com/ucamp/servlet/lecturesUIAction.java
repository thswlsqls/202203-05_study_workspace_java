package com.ucamp.servlet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.LectureVO;
import com.ucamp.model.schoolDAO;

public class lecturesUIAction implements Action {

	@Override
	public String action(HttpServletRequest request){
		String url = "studentsMain.jsp";
		Collection<String> list = new ArrayList<String>();
		Collection<LectureVO> VOlist = new ArrayList<LectureVO>();
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		try {
//			list = new schoolDAO().getLectures();
			VOlist = new schoolDAO().getLecturesByVO();
			System.out.println(VOlist);
			if (VOlist.size() != 0 ) {
				if (id.length()==8) {
//					request.setAttribute("lectures", list);
					request.setAttribute("lectures", VOlist);
					url = "lectures.jsp";
					System.out.println(url);
					System.out.println("Asd");
				}else if (id.length()==3) {
//					request.setAttribute("lectures", list);
					request.setAttribute("lectures", VOlist);
					url = "professorlectures.jsp";
				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
