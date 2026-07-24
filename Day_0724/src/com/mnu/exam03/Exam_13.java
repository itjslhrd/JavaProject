package com.mnu.exam03;
//반복문(for(), while(), do~while()

public class Exam_13 {
	public static void main(String[] args) {
        int a, b, c, sum;
        a = b = 1;
        sum = a + b;

        for(int i = 3; i <= 5; i++) {
            c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.println(sum);

	}

}
