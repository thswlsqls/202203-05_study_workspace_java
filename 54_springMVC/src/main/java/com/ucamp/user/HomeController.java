package com.ucamp.user;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("user", "ȫ�浿");
		
		return "home";
	}
	
	@RequestMapping(value="/loginUI", method=RequestMethod.GET)
	public String loginUI() {
		return "loginUI";
	}
	
	@RequestMapping(value="/loginAction", method=RequestMethod.POST)
	public String loginAction(HttpServletRequest request) {
		String url="loginUI";
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("admin")) {
			url="home";
		}
		
		return url;
	}
	
	
	
	
	
	
	
	
	
	
}
