package com.mnu.exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//
public class Exam_06 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 70);
		map.put("D", 80);
		map.put("E", 90);
		map.put("F", 70);
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
	}

}
