package com.nan.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

	@RequestMapping("/index.html") 
	public String index() {
		
//		ModelAndView mav = new ModelAndView("/main");
//		String url = "/login";
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("layout", "true");
		
//    	return new ModelAndView("main","pro","value1");
    	return "login";
	}
}
