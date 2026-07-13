import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		String na = scn.next();//이름
		int k = scn.nextInt();//국어
		int e = scn.nextInt();//영어
		int m = scn.nextInt();//수학
		
		//총점, 평균
		int t = k + e + m;
		double a = t / 3.;
		
		//합격, 불합격
		String result = "";
		String etc="";//불합격사유
		if(k>=40 && e>=40 && m>=40 && a >=60) {
			result = "합격";
		}else {
			result = "불합격";
			if(k<40 || e<40 || m<40) {
				etc = "과락";
			}else {
				etc = "평균미만";
			}
		}
		
		//출력
		System.out.println("이름 : " + na);
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + a);
		System.out.println("판정 : " + result);
		if(result.equals("불합격")) {
			System.out.println("사유 : " + etc);
		}
		

	}

}
