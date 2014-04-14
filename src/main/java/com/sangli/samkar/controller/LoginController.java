package com.sangli.samkar.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@PostConstruct
	public void afterPropertiesSet() throws Exception { 
		System.out.println("after property set called ");
	}

	@PreDestroy
	public void dstroy() throws Exception { 
		System.out.println("after property set called ");
	}
}
