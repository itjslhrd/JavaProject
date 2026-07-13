//진법변환(10 -> 2진수)

import java.util.Scanner;

public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 입력:");
		int dec = scn.nextInt();
		if(dec < 1 || dec > 100) {
			System.out.println("입력오류");
			System.exit(1);
		}
		
		int imsi = dec;//원본값 복관용
		String bin="";//2진수	
		while(imsi != 0 ) {
			int na = imsi % 2;
			bin = na + bin;//나머지 값을 역순으로 결합 ""+0 +1 + 
			imsi = imsi / 2;
		}
		System.out.println("10진수 : " + dec);
		System.out.println("2진수 : " + bin);
	}

}
