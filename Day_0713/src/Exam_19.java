//키보드로 10진수, 변환할 진수 (2,8,16)

import java.util.Scanner;

public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 :");
		int dec = scn.nextInt();
		System.out.print("변환할 진수:");
		int con = scn.nextInt();
		
		int imsi = dec;
		String str="";// 변환된 진수
		
		while(dec != 0) {
			int na = dec % con;
			switch(na) {
				case 10:
					str = "A" + str;
					break;
				case 11:
					str = "B" + str;
					break;
				case 12:
					str = "C" + str;
					break;
				case 13:
					str = "D" + str;
					break;
				case 14:
					str = "E" + str;
					break;
				case 15:
					str = "F" + str;
					break;
				default:
					str = na + str;//나머지 값이 0 ~ 9
			}
			dec = dec / con;//몫 변경
		}
		//출력
		System.out.println("10진수 : " + imsi);
		System.out.println(con +"진수 : " + str);
	}

}
