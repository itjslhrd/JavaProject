package com.mnu.exam01;

public class Exam_04 {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		//1 ~ 10 난수 5개
		for(int i=1; i<=5; i++) {
			int rr = (int)(Math.random()*10)+1;
			System.out.println(rr);
		}
	}

}
