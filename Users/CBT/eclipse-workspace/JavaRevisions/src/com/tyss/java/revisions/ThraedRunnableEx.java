package com.tyss.java.revisions;

public class ThraedRunnableEx implements Runnable{
	
	
	public void run() {
		
		try {
			
			System.out.println("Thraed " + Thread.currentThread().getId() + " Running");
		}catch (Exception e) {
			System.out.println("exception caught");
		}
	}

}
