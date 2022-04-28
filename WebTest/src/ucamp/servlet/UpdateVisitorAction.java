package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.VisitorDAO;

public class UpdateVisitorAction implements Action {

	@Override
	public String action(HttpServletRequest request) 
			throws ServletException, IOException {
		String url = "updateVisitor.jsp";
		
		String updateContents = request.getParameter("updateContents");
		String inputPw = request.getParameter("inputPw");
		String visitorSeq = request.getParameter("visitorSeq");
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		
		String pw = vDao.getVisitorPw(visitorSeq);
		
		if(pw.equals(inputPw)) {
			if(vDao.updateVisitor(visitorSeq, updateContents)) {
				url = "controller?cmd=visitorListUI";
			}
		}	
		return url;
	}
}

