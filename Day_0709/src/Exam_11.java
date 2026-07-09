// 조건 연산자
//키보드로 정수를 입력 홀수 또는 짝수를 판별하여 출력

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수입력?");
		int jum = scn.nextInt();
		
		//결과를 짝수이면 true, 홀수 이면 false
		boolean bool = jum%2==0;
		System.out.println(bool);
		
		//결과를 짝수이면 false, 홀수 이면 true
		boolean boolA = jum%2==1;
		System.out.println(boolA);
		
		//결과 값이 "홀수", "짝수"
		boolean boolB = jum%2==1;//홀수이면 true
		String str = (boolB) ? "홀수" : "짝수";
		System.out.println(jum +"는" + str);
		
		String str2 = (jum%2==1) ? "홀수" : "짝수";
		System.out.println(jum +"는" + str2);
		
		
	}

}
