//3개의 정수를 입력 대, 중, 소
//교환법(내림차순 정렬)
import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("4개의 정수입력:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int d=scn.nextInt();
		
		//3개의 정수중에서 하나라도 1미만이 입력되면 오류 처리하시오
		if(a<1 || b<1 || c<1) {
			System.out.println("입력오류");
			System.exit(0);
		}
		
		System.out.println(a + "," + b + "," + c);

		if(a<b) {
			int imsi = a;
			a = b;
			b = imsi;
		}
		if(a<c) {
			int imsi = a;
			a = c;
			c = imsi;
		}
		if(a<d) {
			int imsi = a;
			a = d;
			d = imsi;
		}
		
		if(b<c) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		if(b<d) {
			int imsi = b;
			b = d;
			d = imsi;
		}
		if(c<d) {
			int imsi = c;
			c = d;
			d = imsi;
		}
		
		System.out.println(a + ">" + b + ">" + c + ">" + d);
	}

}
