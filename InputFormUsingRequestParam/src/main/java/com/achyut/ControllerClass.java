package com.achyut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class ControllerClass {
	
	@RequestMapping(value="controller",method=RequestMethod.GET)
	public ModelAndView display(@RequestParam("txtName") String txtName,@RequestParam("txtPassword") String txtPassword) {
		
		if(txtName.equals("admin")&&txtPassword.equals("admin")) {
			String message = "Welcome "+ txtName + " you are the admin";
			return new ModelAndView("admin","message",message);
		} else {
			String message = "There is error in index page";
			return new ModelAndView("errorpage","message",message);
		}
		
	}
}