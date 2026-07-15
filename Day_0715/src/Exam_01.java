import java.util.Scanner;
//2, 8진수 변환
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("10 진수 :");
			int dec = scn.nextInt();
			if(dec==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("변환(2,8,16):");
			int con = scn.nextInt();
			//진법변환
			String str="";//변환값
			int imsi = dec;
			while(imsi != 0) {
				int mok = imsi / con;
				int na = imsi % con;
				str = na + str;
				imsi = mok;
				//imsi = imsi / con;//20, 23라인 삭제
			}
			
			//출력
			System.out.println("10진수 " + dec);
			System.out.println(con +"진수 " + str);
		}
	}

}
