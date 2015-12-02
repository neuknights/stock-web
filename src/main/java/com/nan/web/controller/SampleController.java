package com.nan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class SampleController {

	@RequestMapping("/")
	public String index() {
		return "main";
	}
	
	
	@RequestMapping("/eg1.html")
	public String index1() {
		return "login";
	}
	
	@RequestMapping("/eg2.html")
	public String index2() {
		return "main";
	}
	
	@RequestMapping("/eg3.html")
	public String index3() {
		return "main";
	}
}
