package com.tyss.java.revisions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		Student s1 = new Student(21, "kiran", 45);
		Student s2 = new Student(10, "arun", 35);
		Student s3 = new Student(11, "halesh", 75);

		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(1, s3);

		Set<Entry<Integer, Student>> set = map.entrySet();

		Iterator<Entry<Integer, Student>> it = set.iterator();

		while (it.hasNext()) {

			Entry<Integer, Student> et = it.next();

			System.out.println(et.getKey() + " : ");
			System.out.println(et.getValue());
		}

	}

}
