package com.tyss.java.revisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainComparator {
	
	public static void main(String[] args) {
		
		/*
		 * Student[] stu= {new Student(11, "kiran", 25),
		 * 
		 * new Student(25, "arun", 35), new Student(8, "halesh", 60)};
		 * 
		 * 
		 * Arrays.sort(stu, new NameComparator()); for(int i=0; i<stu.length; i++)
		 * System.out.println(stu[i]);
		 */
			
		
		
		Student s1=new Student(11, "kiran", 40);
		Student s2=new Student(8, "arun", 40);
		Student s3=new Student(1, "halesh", 40);
		
	ArrayList<Student>	list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	Collections.sort(list, new NameComparator());
	
	System.out.println(list);
		
		
		
		
	}

}
