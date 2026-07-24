package com.mnu.exam02;

public class Exam_10 {

	public static void main(String[] args) {
	      int kor=71,eng=98,mat=87;
	      int sum = kor+eng+mat;//256
	      //정수(int), 문자(char), 문자열(String)
	      switch(sum / 30) { //8
	         case 10:
	         case 9: System.out.print("A");
	         case 8: System.out.print("B");
	         case 7:
	         case 6: System.out.print("C");
	         default: System.out.print("D"); 
	      }
	      //BCD
	}

}
