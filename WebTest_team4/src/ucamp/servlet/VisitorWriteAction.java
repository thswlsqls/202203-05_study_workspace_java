package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.MemberVisitDAO;

public class VisitorWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "visitorwrite.jsp";
		HttpSession session = request.getSession();
		String id = session.getAttribute("id").toString();
		String writePw = request.getParameter("pw");
		String contents = request.getParameter("contents");
		
		if (new MemberVisitDAO().addWrite(id,writePw,contents)) {
			url = "controller?cmd=visitorwritelistUI";
		}
		
		return url;
	}

}
