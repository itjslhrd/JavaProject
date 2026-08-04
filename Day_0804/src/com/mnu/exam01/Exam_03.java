package com.mnu.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_03 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet();
		Set<String> set2 = new HashSet();
		
		set.add(1);		
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		
		System.out.println(set);
		
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println(set2);
		
		System.out.println(set2.contains("B"));
		
	}

}
