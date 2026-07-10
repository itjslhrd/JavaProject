//키보드로 정수 2개 입력 큰값을 출력하시오

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 2개 입력:");
		
		int a=scn.nextInt();
		int b=scn.nextInt();
		//a=5, b=7
/*		//잘못장성된 예제
		if(a>b) {
			System.out.println(a + ">" + b);
		}
		
		if(a<b) {
			System.out.println(a + "<" + b);
		}else{
			System.out.println(a + "==" + b);
		}
*/
		if(a>b) {
			System.out.println(a + ">" + b);
		}else {//a<b,  a==b
			if(a<b) {
				System.out.println(a + "<" + b);
			}else {
				System.out.println(a + "==" + b);
			}
		}
		
	}
}
