package com.achyut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	
	@RequestMapping(value="/controller1",method=RequestMethod.POST)
	public ModelAndView showController1() {
		String message = "This is message from controller1 class";
		return new ModelAndView("controller1","controller1Message",message);
	}
}
