package com.achyut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {
	
	@RequestMapping(value="/controller2", method=RequestMethod.GET)
	public ModelAndView showController2() {
		String message = "This is from controller2 class";
		return new ModelAndView("controller2","controller2Message",message);
	}
}
