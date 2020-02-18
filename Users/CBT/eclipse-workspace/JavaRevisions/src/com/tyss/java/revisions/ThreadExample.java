package com.tyss.java.revisions;

public class ThreadExample extends Thread {
	
	
	public void run() {
		
		try {
			
			System.out.println("Thread " + Thread.currentThread().getId() + " runnig");
		}catch (Exception e) {
			System.out.println("exception caught");
		}
		
		
	}
	
	
	

}
