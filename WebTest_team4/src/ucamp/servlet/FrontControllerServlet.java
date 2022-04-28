package ucamp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	  
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//filter ���� ó�� ����
		request.setCharacterEncoding("utf-8");
		String cmd=request.getParameter("cmd");		
		Action a=null;
		
		String url="main.jsp";
		if(cmd !=null ) {
			a=ActionFactory.getAction(cmd);;
			url=a.action(request); //Action�������� �̵��ؼ� DAO�� �ʿ��ϴٸ� �ű⼭ �۾�
		}
		//����
		request.getRequestDispatcher("/"+url).forward(request, response);
		System.out.println("controller ==="+cmd);
	}
}
