package com.tyss.java.revisions;

public class MyExceptionMain {
	
	public static void main(String[] args) {
		
		
		try {
			
			throw new MyException("Myexception");
		}catch (MyException e) {

			System.out.println("exception caught");
			System.out.println(e.getMessage());
		}
	}

}
