package com.tyss.springboot.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {
	
	String message="muhib";
	String message2="kiran";
	
	MessageUtil msg=new MessageUtil(message2);
	
	@Test
	public void testPrintMessage() {
		
		assertEquals(message2,msg.printMessage());
		
	}
	
	
	
	
	   
	
	

}
