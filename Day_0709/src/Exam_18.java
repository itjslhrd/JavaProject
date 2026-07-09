import java.util.Scanner;
//입력된 값이 80 ~ 90 이면 "Pass"
public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력:");
		int score = scn.nextInt();
		
		String pass="";
		if(score>=80 && score<=90) {
			pass="Pass";
		}
		System.out.println("result=" + pass);
		//score=95
		if(score>=80) {
			if(score<=90) {
				pass="Pass";
			}
		}
		
		

	}

}
