/* 키보드로 이름 국어 영어 수학 입력 총점 평균 등급을 구하여 출력
 * 등급은 100~90 수, 89~80 우, 79~70 미, 69~60 양, 59~0 가
 * [입력형식]
 * 입력 : 이학생 90 77 85
 * 
 * [출력형식]
 * 이름 : 이학생
 * 총점 : xxx
 * 평균 : xx.xx
 * 등급 : x
 * 
 * switch ~ case만 사용
 */

import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name=scn.next();//이름
		int kor = scn.nextInt();//국어
		int eng = scn.nextInt();//영어
		int mat = scn.nextInt();//수학

		//계산
		int tot = kor+eng+mat;//총점
		double ave = (int)(tot/3.*100+0.5)/100.;//반올림
		double ave1 = tot/3.;//반올림을 안한 경우
		
		String grade="가";//등급계산
		
		int menu = (int)ave/10;
		switch(menu) { //((int)ave/10)
			case 10:
			case 9:
				grade="수";
				break;
			case 8:
				grade="우";
				break;
			case 7:
				grade="미";
				break;
			case 6:
				grade="양";
				break;
		}

		//출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("평균 : " + String.format("%.2f", ave1));
		System.out.println("등급 : " + grade);

	}

}
