package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

public class GetVisitorListByIdAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
			
		String inputId = request.getParameter("inputId");
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		Collection<VisitorVO> vList = vDao.getVisitorListById(inputId);

		HttpSession session = request.getSession();
		request.setAttribute("vList", vList);
		session.setAttribute("vList", vList);
		
		System.out.println(vList);
		
		return "visitorList.jsp";
	}

}
