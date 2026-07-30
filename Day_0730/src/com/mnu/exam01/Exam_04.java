package com.mnu.exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_04 {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		
		a.add("김학생");
		a.add("이학생");
		a.add("박학생");
		a.add("강학생");
		a.add("홍학생");
		
		//리스트 출력 -1 기본 for
		System.out.print("기본 for : ");
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i) + "  ");
		}
		System.out.print("\n");
		
		//리스트 출력 -2 확장 for
		System.out.print("확장 for : ");
		for(String  i: a) {
			System.out.print(i + "  ");
		}
		System.out.print("\n");
		
		//리스트 출력 -3 반복자 Iterator 인터페이스
		System.out.print("반복자 : ");
		Iterator<String> iter = a.iterator();
		while(iter.hasNext()) {//존재하면
			System.out.print(iter.next() + "  ");
		}
		
		
	}

}
