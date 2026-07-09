/*  키보드로 이름 국어 영어 수학 점수를 입력 총점, 평균, 판정을 구하여 출력
 *  1. 입력은 한줄로 입력
 *     입력 : 이학생 99 88 79
 *  2. 평균은 소수이하 3째자리에서 반올림
 *  3. 판정은 3과목 모두 60점이상, 평균이 80이상 "합격" 아니면 "불합격"
 *  4. 출력은 다음과 같이 한다(예시)
 *     이름    총점     평균    판정
 *     이학생  265     87.56  합격
 */

import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name = scn.next();//이름
		int kor = scn.nextInt();//국어
		int eng = scn.nextInt();//영어
		int mat = scn.nextInt();//수학
		
		int tot = kor + eng + mat;//총점
		double ave = (int)(tot /3. * 100 +0.5) / 100.;
/*		
		String panjeng = "";
		if(ave>=80) {
			panjeng = "합격";
		}else {
			panjeng = "불합격";
		}
*/
		
		String panjeng = "불합격";
		if(kor>=60 && eng >= 60 && mat >=60 && ave>=80) {
			panjeng = "합격";
		}
		//출력
		System.out.println("이름\t총점\t평균\t판정");
		System.out.println(name + "\t" + tot + "\t" + ave 
				+ "\t" + panjeng);
		
	}

}
