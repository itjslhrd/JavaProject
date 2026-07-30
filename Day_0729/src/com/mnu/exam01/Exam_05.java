package com.mnu.exam01;

import java.util.Random;

public class Exam_05 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=1; i<=5; i++) {
			int lotto = r.nextInt(45);//0 ~ 44
			System.out.println(lotto);
		}
	}

}
