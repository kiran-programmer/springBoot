package com.tyss.java.revisions;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		/*
		 * if(s1.rollno>s2.rollno) { return 1; }else if(s1.rollno==s2.rollno) { return
		 * 0; }else { return -1; }
		 */
		return s1.rollno-s2.rollno;
		
	}

}
