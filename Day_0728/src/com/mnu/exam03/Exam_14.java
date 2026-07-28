package com.mnu.exam03;

public class Exam_14 {
	public static void main(String[] args) {
		String str1="1234ABCDEF";
		char c = str1.charAt(4);
		System.out.println(c);
		
		for(int i=0; i<str1.length(); i++) {
			char cc = str1.charAt(i);
			System.out.println(cc);
		}
	}

}
