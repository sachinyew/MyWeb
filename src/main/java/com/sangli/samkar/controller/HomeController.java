package com.sangli.samkar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
/*	@Autowired
	private LoginController login;*/
	@RequestMapping(value="/", method=RequestMethod.GET)
	public  String showHome2() {
		System.out.println("redirecting to home page");
		//System.out.println(login);
		return "home";
	} 
}
