package com.nan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	
	@RequestMapping("/login.html")
	public ModelAndView login() {
		
		return new ModelAndView("main","result",true);
	}
	
	
	public String logout() {
		
		return "login";
	}
}
