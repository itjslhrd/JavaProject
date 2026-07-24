package com.mnu.exam03;

public class Exam_16 {

	public static void main(String[] args) {
        int a = 0, sum = 0;
        while(a < 10) {
            a++;//1 2 3 4 5 6 7 8 9 10
            if(a%2==1)
                continue;
            sum += a;//2+4+6+8+10
        }
        System.out.println(sum);//30

	}

}
