package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList();
		
		//입력 사항
		String n = "김사람";
		int a = 30;
		boolean b=false;
		
		Person p1 = new Person(n, a, b);
		pList.add(p1);
		p1 = new Person("이상원", 27, true);
		pList.add(p1);
		
		pList.add(new Person("홍사원", 40, true));
		
		System.out.println("전체 사원 : " +  pList);
		
		System.out.println("이름\t나이\t성별");
		for(Person p : pList) {
			System.out.print(p.name + "\t");
			System.out.print(p.age + "\t");
			if(p.gender)
				System.out.print("남자\n");
			else
				System.out.print("여자\n");
		}
		
		
		
		
		
		
		
		//System.out.println(p1);
		//System.out.println(p1.name + ":" + p1.age + ":" + p1.gender);
		
		
	}

}
