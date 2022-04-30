package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;


@WebServlet("/ajaxController")
public class FrontAjaxControllerServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext application = getServletContext();
		if(application.getAttribute("mDao") == null) {
			application.setAttribute("mDao", new MemberDAO());
		}
		if(application.getAttribute("vDao") == null) {
			application.setAttribute("vDao", new VisitorDAO());
		}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		response.setCharacterEncoding("utf-8");
		
		String cmd = request.getParameter("cmd");
		Object data = null;
		
		AjaxAction aa = null;
		if(cmd != null) {
			aa=AjaxActionFactory.getAjaxAction(cmd);
			data = aa.action(request, response);
		}
		
		response.getWriter().print(data);
	}
}
