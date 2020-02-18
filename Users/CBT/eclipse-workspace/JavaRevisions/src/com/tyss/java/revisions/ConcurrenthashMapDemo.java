package com.tyss.java.revisions;

import java.util.HashMap;

public class ConcurrenthashMapDemo {
	
	public static void main(String[] args) {
		
		
		/*
		 * ConcurrentHashMap<Integer, String> chs= new ConcurrentHashMap<Integer,
		 * String>();
		 * 
		 * chs.put(21, "hello"); chs.put(21, "world");
		 * 
		 * chs.putIfAbsent(1, "hello");
		 * 
		 * System.out.println(chs);
		 */
		
		
		HashMap<Integer, String> hs=new HashMap<>();
		hs.put(1, "kiran");
		
		hs.put(1, "arun");
		
		System.out.println(hs);
	}

}
