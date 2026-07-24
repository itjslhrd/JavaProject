package com.mnu.exam02;
//제어문
public class Exam_07 {
	public static void main(String[] args) {
		int i=75, j=9;
		int k;
		if(i>j)
			k=i-j;//75-9
		else
			k=i+j;
		
		k=(i>j)? i-j : i+j ;
		System.out.println(k);

	}

}
