//키보드로 7개의 데이터를 입력 총점, 평균을 구하여 출력
// for()

import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("데이터 입력:");
		
		int tot=0;
/*		
		for(int i=1; i<=7; i++) {
			int a = scn.nextInt();
			tot = tot + a;
		}
*/		
		int cnt=0;// 데이터 수 카운트
		while(cnt<7) {
			int a = scn.nextInt();
			cnt++;
			tot += a;
		}
		System.out.println("합 계 :" + tot);
	}

}
