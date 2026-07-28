package com.mnu.exam02;

import java.io.IOException;

public class Exam_08 {
	public static void main(String[] args) {
		System.out.print("1문자 입력:");
		try {
			int ch = System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
