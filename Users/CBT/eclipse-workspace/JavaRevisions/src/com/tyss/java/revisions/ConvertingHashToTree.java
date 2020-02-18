package com.tyss.java.revisions;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertingHashToTree {
	
	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("kiran");
		hs.add("arun");
		hs.add("ishu");
		
		TreeSet<String> ts=new TreeSet<>(hs);
		System.out.println("hashset elemnts sorted using treeset order"+ ts);
	}

}
