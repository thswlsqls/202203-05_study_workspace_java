package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

/**ajax 통신과 GSON 활용법 테스트용임. 사용하지 않음. */
@WebServlet("/ajaxControllerNotUse")
public class AjaxController extends HttpServlet {

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
	
	protected void service(HttpServletRequest request
			, HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("text/json");

		String inputId = request.getParameter("inputId");

		JsonObject data = new JsonObject();
		
		data.addProperty("inputId", inputId);
		
		MemberDAO mDao = (MemberDAO) request.getServletContext().getAttribute("mDao");
		if(mDao.isValidAddMemberId(inputId)) {
			data.addProperty("isValidId", "false");
		}else {
			data.addProperty("isValidId", "true");
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(data);
	}
}
