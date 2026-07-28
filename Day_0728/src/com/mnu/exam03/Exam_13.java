package com.mnu.exam03;

public class Exam_13 {
	public static void main(String[] args) {
		String str1="Korea";            
	    String str2="Korea"; 
	    String str3=new String("Korea");
	    String str4=new String("Korea");
	    
	    System.out.println("str1==str2 : " + (str1==str2));// 같은 주소
	    System.out.println("str1.equals(str2) : " + (str1.equals(str2)));// 같은 객체
	    System.out.println("str1==str3 : " + (str1==str3));
	    System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
	    System.out.println("str3==str4 : " + (str3==str4));
	    System.out.println("str3.equals(str4) : " + (str3.equals(str4))); 
	}
}
