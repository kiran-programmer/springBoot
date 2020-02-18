package com.tyss.java.revisions;

public class TwoNumbers {
	
	public static void main(String[] args) {
		
		
		int[] s= {1,5,6,4,2,8,8,7,25,9,5};
		int sum=8;
		
		for(int i=0; i<s.length; i++) {
			
			for(int j=i+1;  j<s.length; j++) {
				
				if(s[i]+s[j]==sum) {
					
					
						
						System.out.println(" " + s[i] + " " + s[j]);
					
				}
			}
		}
	}

}
