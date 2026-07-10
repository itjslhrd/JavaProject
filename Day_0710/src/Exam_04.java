//학점 ( 90이상, 80이상, 70이상, 60이상, 60미만

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("점수입력:");
		int val = scn.nextInt();
		
		String hakjum="";
		if(val >= 90) {
			hakjum="수";
		}else if(val>=80) {
			hakjum="우";
		}else if(val>=70) {
			hakjum="미";
		}else if(val>=60) {
			hakjum="양";
		}else {
			hakjum="가";
		}
		System.out.println(val + "의 학점은 " + hakjum);
	}

}
