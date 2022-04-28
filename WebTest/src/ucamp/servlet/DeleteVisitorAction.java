package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.VisitorDAO;

public class DeleteVisitorAction implements Action {

	@Override
	public String action(HttpServletRequest request) 
			throws ServletException, IOException {

		String inputPw = request.getParameter("inputPw");
		String visitorSeq = request.getParameter("visitorSeq");
		
		String url = "controller?cmd=visitorUI&visitorSeq="+visitorSeq;
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		
		HttpSession session = request.getSession();
		String pw = vDao.getVisitorPw(visitorSeq);
		
		if(pw.equals(inputPw)) {
			if(vDao.deleteVisitor(visitorSeq)) {
				url = "controller?cmd=visitorListUI";
			}
		}	
		return url;
	}
}
