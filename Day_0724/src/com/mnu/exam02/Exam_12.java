package com.mnu.exam02;

public class Exam_12 {

	public static void main(String[] args) throws Exception{
        //입력 값이 'c' 인경우
		System.out.print("1문자 입력:");
		//System.in.read(); 1문자를 입력받어서 정수로 반환
		char ch = (char)System.in.read();
        switch(ch) {
           case 'a':
               System.out.print("one");
           case 'b':
               System.out.print("two");
           case 'c':
               System.out.print("three");
               break;
           case 'd':
               System.out.print("four");
               break;
       }

	}

}
