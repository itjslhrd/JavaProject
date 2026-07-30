package com.mnu.exam01;

import java.time.LocalDate;
import java.util.Date;

public class Exam_08 {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now);
		
		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);

	}

}
