//화폐단위별(10종류) 매수를 구하여 출력

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력:");
		int pay = scn.nextInt();
		int money = 50000;//처음 화폐 5만원
		System.out.printf("급여 : %7d\n", pay);
		boolean flag = true;
	
		while(pay != 0) {
			System.out.printf("%5d : ", money);
			int mok = pay / money;
			System.out.printf("%3d : ", mok);
			pay = pay % money;
			
			if(flag) {
				money = money / 5;
				flag = false;
			}else {
				money = money / 2;
				flag=true;
			}
		}
	}
}
