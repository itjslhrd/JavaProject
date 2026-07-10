//3개의 정수를 입력 최대값, 최소값 찾기

import java.util.Scanner;

public class Exam_08_2 {
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
		
		int max = a;
		if(max<b) {
			max=b;
		}
		if(max < c) {
			max=c;
		}
		
		System.out.println(a + "," + b + "," + c + "=" + max);
		
		//조건 연산자 이용시
		int max2 = (a>b) ? a : b ;
		max2 = (max2>c) ? max2 : c;
		
	}

}
