package com.tyss.java.revisions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashEx {
	
	public static void main(String[] args) {
		
		
		Integer[] s= {1,1,1,1,2,5,4,8,4,1,5,2};
		
		Set<Integer> lhs=new HashSet<Integer>();
		
		for(int i=0; i<s.length; i++) {
			
			lhs.add(s[i]);
			
			System.out.println(lhs);
		}
	}

}
