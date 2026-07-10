//키보드 이름, 국어, 영어, 수학, 과학 점수를 입력 총점, 평균을 구하여
// 최대 점수, 최소점수를 출력
/*  입력 : 홍길동 90 80 70 60
 *  
 * [출력]
 *  이름 :
 *  총점 :
 *  평균 :
 *  최대점수:
 *  최소점수:
 *  
 */

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String name=scn.next();//이름
		int kor = scn.nextInt();//국어
		int eng = scn.nextInt();//영어
		int mat = scn.nextInt();//수학
		int sec = scn.nextInt();//과학

		//계산
		int tot = kor+eng+mat+sec;//총점
		double ave = (int)(tot/4.*100+0.5)/100.;//반올림
		double ave1 = tot/4.;//반올림을 안한 경우
		
		int max = kor;
		int min = kor;
		//영어
		if(max < eng) {//최대
			max = eng;
		}else if(min > eng) {//최소
			max = eng;
		}
		//수학
		if(max < mat) {//최대
			max = mat;
		}else if(min > mat) {//최소
			max = mat;
		}
		//과학
		if(max < sec) {//최대
			max = sec;
		}else if(min > sec) {//최소
			max = sec;
		}

		//출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);

		
		
		
		
	}

}
