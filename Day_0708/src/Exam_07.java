import java.util.Scanner;
/*   이름 : 
 *   국어 :
 *   영어 :
 *   수학 :
 *   
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String na = scn.next();
		System.out.print("국어 : ");
		int kor = scn.nextInt();
		System.out.print("영어 : ");
		int eng = scn.nextInt();
		System.out.print("수학 : ");
		int mat = scn.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot / 3.;
		//double ave = (double)tot / 3;//형변환
		
		System.out.println("이름\t총점\t평균");
		System.out.println(na + "\t" + tot + "\t" + ave);
		
		
		
	}

}
