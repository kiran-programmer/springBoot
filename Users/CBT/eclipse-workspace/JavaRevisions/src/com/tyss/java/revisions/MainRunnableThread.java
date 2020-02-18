package com.tyss.java.revisions;

public class MainRunnableThread {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=8; i++) {
			Thread t1=new Thread(new ThraedRunnableEx());
			t1.start();
			
		}
	}

}
