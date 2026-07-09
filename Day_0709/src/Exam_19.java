/*  키보드로 이름 국어 영어 수학 점수를 입력 총점, 평균, 판정을 구하여 출력
 *  1. 입력은 한줄로 입력
 *     입력 : 이학생 99 88 79
 *  2. 평균은 소수이하 3째자리에서 반올림
 *  3. 판정은 3과목 모두 60점이상이고 평균이 80이상 "합격" 아니면 "불합격"
 *  4. 불합격 사유 출력
 *     - 한과목이라도 60미만 인 경우 "과락"
 *     - 3과목 모두 60이상이나 평균이 80미만이면 "평균미만"
 *  5. 출력은 다음과 같이 한다(예시)
 *  1. 이름    총점     평균    판정  불합격사유
 *     이학생  265     87.56  합격

 *  2. 이름    총점     평균    판정    불합격사유
 *     강학생   265     87.56  불합격  과락
 *     
 */

import java.util.Scanner;

public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name = scn.next();//이름
		int kor = scn.nextInt();//국어
		int eng = scn.nextInt();//영어
		int mat = scn.nextInt();//수학
		
		int tot = kor + eng + mat;//총점
		double ave = (int)(tot /3. * 100 +0.5) / 100.;

		String pass="";//합격/불합격
		String etc="";// 불합격 사유
		if(kor>=60 && eng>=60 && mat>=60 && ave>=80) { // 합격일 경우
			pass="합격";
		}else {//불합격일 경우
			pass="불합격";
			if(kor<60 || eng<60 || mat<60) {
				etc="과락";
			}else {
				etc="평균미만";
			}
		}
		//출력
		System.out.println("이름\t총점\t평균\t판정\t사유");
		System.out.println(name + "\t" + tot + "\t" + ave 
				+ "\t" + pass + "\t" + etc);

	}

}
