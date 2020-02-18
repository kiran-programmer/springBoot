package com.tyss.java.revisions;

import java.util.ArrayList;
import java.util.HashMap;

public class GFG {
	
	public static void main(String[] args) {
		
		
		Student s1=new Student(11, "kiran", 45);
		Student s2=new Student(12, "arun", 55);
		Student s3=new Student(18, "halesh", 45);
		
		/*
		 * ArrayList<Student> list=new ArrayList<>(); list.add(s1); list.add(s2);
		 * list.add(s3);
		 */
	
	
	
HashMap<Integer, ArrayList<Student>>	hm=new HashMap<Integer,  ArrayList<Student>>();
hm.put(1, new ArrayList<>());
hm.put(2, new ArrayList<>());

ArrayList<Student> l=hm.get(1);
l.add(s1);
l.add(s2);
l.add(s3);
hm.put(1, l);
System.out.println(hm);
ArrayList<Student> l1=hm.get(2);
l1.add(s1);



	}

}
