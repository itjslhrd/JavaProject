//화폐단위 별 매수 출력

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("급여입력:");
		int pay = scn.nextInt();
		int money = 50000;
		
		for(int i=1; i<=10; i++) {
			System.out.print(money + "원 : ");
			int mok = pay / money;
			System.out.println(mok);
			pay = pay % money;
			if(i%2==1) {
				money /= 5;//money=money/5
			}else {
				money /= 2 ;//money=money/2;
			}
			if(pay==0) {
				break;
			}
		}

	}

}
