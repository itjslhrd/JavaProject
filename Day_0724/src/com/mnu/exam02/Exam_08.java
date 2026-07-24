package com.mnu.exam02;

public class Exam_08 {
	public static void main(String[] args) {
		int a=1, b=2, c=3, d=4;
		int mx, mn;
		mx=a<b?b:a;//mx=2
		if(mx==1)
			mn=a>b?b:a;
		else
			mn=b<mx?d:c;
		System.out.print(mn);//3
		
				
	}

}
