package com.achyut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command",new Student());
	}
	
	
	@RequestMapping(value="/addstudent",method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("SpringMVCTAGLibrary")Student student,ModelMap modelMap) {
		modelMap.addAttribute("name", student.getName());
		modelMap.addAttribute("address", student.getAddress());
		modelMap.addAttribute("age", student.getAge());
		
		return new ModelAndView("return","student",modelMap);
	}
	
}
