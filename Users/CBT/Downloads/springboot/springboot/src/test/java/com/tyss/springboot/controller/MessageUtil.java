package com.tyss.springboot.controller;

public class MessageUtil {
	
	private String message="hello";
	
	public MessageUtil(String message) {
		
		this.message=message;
		
	}
	
	
	public String printMessage() {
	
		return message;
	}
	
	

}
