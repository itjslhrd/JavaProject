package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_03 {
	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list = new ArrayList();
		
		//list.add(new Integer(10));
		list.add(10);
		//list.add("20");
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("전체 객체 : " + list);
		
		//합계
		int s=0;
		int data;
		for(int i=0;i<list.size(); i++) {
			data = list.get(i);
			s += data;
			System.out.print(data);
			//System.out.print(list.get(i));
		}
		
		int a= 10;
		Integer aa = a;//박싱
		
		int b = aa;
		
		
	}

}
