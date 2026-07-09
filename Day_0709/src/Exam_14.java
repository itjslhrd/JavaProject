//키보드로 정수를 입력 입력된 정수가 80이상 "합격" 아니면 "불합격"

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("점수입력");
		int score = scn.nextInt();
		
		// 조건 연산자를 이용한 경우
		String pass = (score>=80)?"합격":"불합격";
		System.out.println(score + " : " + pass);
		
		//if()
		String pass2="";
		if(score>=80) {
			pass2="합격";
		}else {
			pass2="불합격";
		}
		System.out.println(score + " : " + pass2);

	}

}
