package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

public class GetVisitorListByIdAction implements AjaxAction {

//	@Override
//	public String action(HttpServletRequest request) throws ServletException, IOException {
//			
//		String inputId = request.getParameter("inputId");
//		
//		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
//		Collection<VisitorVO> vList = vDao.getVisitorListById(inputId);
//
//		HttpSession session = request.getSession();
//		request.setAttribute("vList", vList);
//		session.setAttribute("vList", vList);
//		
//		System.out.println(vList);
//		
//		return "visitorList.jsp";
//	}

	@Override
	public Object action(HttpServletRequest request
			, HttpServletResponse response)
			throws ServletException, IOException {
		
		String inputId = request.getParameter("inputId");
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		Collection<VisitorVO> vList = vDao.getVisitorListById(inputId);

		Gson gson = new Gson();
		String json = gson.toJson(vList);
		
		return json;
	}

}
