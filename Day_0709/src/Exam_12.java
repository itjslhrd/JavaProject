//키보드로 실수를 입력 입력된 값이 85 ~ 95사이면 "Pass"
//아니면 "No" 출력하는 프로그램 작성

import java.util.Scanner;

public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		double val = scn.nextDouble();
		
		String str = (val>=85 && val <=95) ? "Pass" :"No";
		System.out.println(val + "는 " + str + "입니다");
		
		boolean bool1 = val>=85;
		boolean bool2 = val<=95;
		String str2 = (bool1 && bool2) ? "Pass" :"No";
		System.out.println(val + "는 " + str2 + "입니다");
		
		
	}

}
