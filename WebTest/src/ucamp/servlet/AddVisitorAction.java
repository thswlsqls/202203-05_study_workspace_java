package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

public class AddVisitorAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "addVisitor.jsp";
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		
		String pw = request.getParameter("pw");
		String contents = request.getParameter("contents");
		
		if(vDao.addVisitor(memberId, pw, contents)) {
			url = "controller?cmd=visitorListUI";
		}
		
		return url;
	}

}
