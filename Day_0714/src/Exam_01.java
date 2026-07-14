/*
    키보드로 N(값) 입력 1 ~ N 까지 정수를 출력 후 홀수의 합을 출력
    - 한 줄에는  10깨씩 출력
*/

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int n=scn.nextInt();
		
		int sum=0;// 홀수 합
		for(int i=1; i<=n; i++) {
			System.out.printf("%4d", i);
			if(i%10==0) {
				System.out.print("\n");
			}
			if(i%2==1) {
				sum += i;//sum = sum + i;
			}
		}
		System.out.println("홀수 합 : " + sum);
	}

}
