package com.mnu.exam03;

public class Exam_18 {
//다음은 10진수를 입력으로 2진수로 변환하는 프로그램의 일부분이다
//[   ] 채워 완성하시오
	public static void main(String[] args) {
        int val= 25;
        int mok, nmg;
        String bin="";
        while(val != 0) {
           //mok = val / 2;
           nmg = val % 2;
           bin = nmg + bin;
           //val = mok ;
           val /= 2;
        }
         System.out.println("2진수 :" + bin);

	}

}
