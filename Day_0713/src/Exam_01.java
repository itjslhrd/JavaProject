import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("10진수 입력:");
		int dec = scn.nextInt();
		if(dec<1 || dec > 15) {
			System.out.println("입력오류");
			System.exit(1);
		}
		//정상입력
		int mok = dec / 16;//몫
		int na = dec % 16;//나머지
		
		String con="";
		if(na==10) {
			con = "A";
		}else if(na==11) {
			con = "B";
		}else if(na==12) {
			con = "C";
		}else if(na==13) {
			con = "D";
		}else if(na==14) {
			con = "E";
		}else if(na==15) {
			con = "F";
		}else {
			con = na+"";//문자열 정수로 int aa = Integer.parseInt("1")
		}
		System.out.println("10진수 : " + dec);
		System.out.println("16진수 : " + con);
	}

}
