package com.sangli.samkar.controller;

import org.springframework.beans.factory.DisposableBean;

public class LogoutController implements DisposableBean {
	
	@Override
	public void destroy(){
		System.out.println("destroy called");
	}

}
