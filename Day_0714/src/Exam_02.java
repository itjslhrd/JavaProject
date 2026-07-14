//화폐단위별(10종류) 매수를 구하여 출력

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력:");
		int pay = scn.nextInt();
		int money = 50000;//처음 화폐 5만원
		System.out.printf("급여 : %7d\n", pay);
		for(int i=1; i<=10; i++) {
			System.out.printf("%5d : ", money);
			int mok = pay / money;
			System.out.printf("%3d\n", mok);
			pay %= money; // pay = pay % money;
			if(i%2==1) {
				money = money / 5;
			}else {
				money = money / 2;
			}
			
			if(pay==0)
				break;
		}
	}

}
