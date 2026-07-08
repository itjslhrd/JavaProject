/*  키보드 입력 Scanner 클래스 도움으로 입력
 *  정수, 실수, 문자열 구분하여 입력 가능
 * 
 */
import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] args) {
		//객체 생성(클래스를 이용하여 객체 생성)
		Scanner scn;//변수선언
		scn = new Scanner(System.in);//객체 생성
		
		Scanner scn2 = new Scanner(System.in);
		System.out.print("이름 국어 영어 수학 입력하시오");
		String name = scn.next();//문자열
		int k = scn.nextInt();//정수
		int e = scn.nextInt();//정수
		int m = scn.nextInt();//정수
		
		System.out.println("이름 : " +  name);
		System.out.println("국어 : " +  k);
		System.out.println("영어 : " +  e);
		System.out.println("수학 : " +  m);
		System.out.println("총점 : " +  (k+e+m));
		System.out.println("평균 : " +  (k+e+m)/3);
		
	}

}
