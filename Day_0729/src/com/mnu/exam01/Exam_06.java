package com.mnu.exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		try {
			Scanner scn = new Scanner(new File("src/data.txt"));
			String line = null;
			while(scn.hasNextLine()) {
				line = scn.nextLine();
				System.out.println(line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
