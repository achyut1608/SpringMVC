package com.achyut;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputController {

	@RequestMapping(value="controller",method=RequestMethod.GET)
	public ModelAndView authenticateUser(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("txtName");
		String password = request.getParameter("txtPassword");
		if(name.equals("admin")&& password.equals("admin")) {
			
			String message  = "welcome admin!!!";
			return new ModelAndView("admin","message",message);
		} else {
			String message ="sorry invalid user name and password";
			return new ModelAndView("errorpage","message",message);
		}
			
		
	}
	
}
