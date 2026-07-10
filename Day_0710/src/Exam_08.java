//3개의 정수를 입력 최대값, 최소값 찾기

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("3개의 정수입력:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		//3개의 정수중에서 하나라도 1미만이 입력되면 오류 처리하시오
		if(a<1 || b<1 || c<1) {
			System.out.println("입력오류");
			System.exit(0);
		}
		// && 이용시
		if(a>b && a>c) {
			System.out.println(a+","+b+","+c+ "=" + a);
		}else if(a>b && a<c) {
			System.out.println(a+","+b+","+c+ "=" + c);
		}else if(a<b & b>c) {
			System.out.println(a+","+b+","+c+ "=" + b);
		}else {
			System.out.println(a+","+b+","+c+ "=" + c);
		}
		
		
	}

}
