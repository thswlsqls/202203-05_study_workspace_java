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

@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	  
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
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//filter 패턴 처리 권장
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		ServletContext application = getServletContext();
		application.setAttribute("respWriter", response.getWriter());
		
		String cmd=request.getParameter("cmd");		
		Action a=null;
		
		String url="main.jsp";
		
		if(cmd == null) {
			url="main.jsp";
		}
		if(cmd !=null ) {
			a=ActionFactory.getAction(cmd);;
			url=a.action(request); //Action페이지로 이동해서 DAO가 필요하다면 거기서 작업
		}
		//공통
		request.getRequestDispatcher("/"+url).forward(request, response);
		
	}
}
