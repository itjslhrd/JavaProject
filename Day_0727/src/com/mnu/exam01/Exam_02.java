package com.mnu.exam01;

public class Exam_02 {
	static int mp(int base, int exp) {
	      int res=1;
	      for(int i=0; i<exp; i++)
	         res *= base;
	      return res;
	   }

	public static void main(String[] args) {
	      int res;
	      res = mp(2,10);
	      System.out.print(res);
	}

}
