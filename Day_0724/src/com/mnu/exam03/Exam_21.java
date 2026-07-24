package com.mnu.exam03;
/*  1
 *  2  3
 *  4  5  6
 *  7  8  9  10
 *  11 12 13 14 15  
 * 
 */
public class Exam_21 {
	public static void main(String[] args) {
	    int i, j, n=0;
	    for (i = 1; i <= 5; i++) {
	        for (j = 1; j <= i; j++) {
	            n++; // n+=1, n=n+1
	            System.out.printf("%3d", n);
	        }
	        System.out.printf("\n");
	    }
	}

}
