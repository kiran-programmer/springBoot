package com.tyss.java.revisions;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CMEexample {
	
	
	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> list=new ArrayList<>();
		 * 
		 * list.add(11); list.add(13); list.add(18);
		 */
	CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>(new Integer[] {10,9,8,7,25,2});
	
	Iterator<Integer> it=list.iterator();
	
	while(it.hasNext()) {
			
		
		
			  Integer i=it.next(); 
			  System.out.println(i);
			  
			 if(i==2) {
				 list.add(78);
			 }
			 
			 
		
			/*
			 * if(it.next()==11) {
			 * 
			 * list.remove(11);
			 * 
			 * }
			 * 
			 * System.out.println(list);
			 */
	}
	
	
	System.out.println(list);
	
	}

}
