

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/missionLoginAction")
public class MissionLoginActionServlet extends HttpServlet {

	protected void service(HttpServletRequest request
			, HttpServletResponse response) throws ServletException
												, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/mission_userMain.jsp");
		dispatcher.forward(request, response);
		
	}

}
