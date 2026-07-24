package com.mnu.exam03;

public class Exam_14 {

	public static void main(String[] args) {
        int i, j=0;
        for(i=0; i<=5; i++) {//i=0,1,2,3,4,5
             j += i;//+0+1+2+3+4+5
             System.out.print(i);    // 0 + i +   =15
             if(i==5) {
                 System.out.print("=");
             }else {
                 System.out.print("+");
             }
       }
       System.out.println(j);

	}

}
