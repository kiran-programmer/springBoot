package com.tyss.java.revisions;

public class MainThread {
	
	
	public static void main(String[] args) {
		
		int n=8;
		for(int i=0; i<n;i ++) {
			ThreadExample ex=new ThreadExample();
			ex.start();
		}
	}

}
