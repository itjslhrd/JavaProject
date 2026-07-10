//키보드로 정수 연산자 정수 입력 산술연산(+,-,*,/,%)을 수행하는 프로그램작성
import java.util.Scanner;
public class Exam_07 {
	public static void main(String[] args) {
		//문자열 비교는 [문자열=="문자열" ?X,  문자열.equals("문자열")]
		// 입력 : 7 * 7
		// 7 * 7 = 49
		//System.out.printf("%d * %d = %d \n", 7,7,(7*7));
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 :");
		int a = scn.nextInt();//정수
		String op = scn.next();//연산자
		int b = scn.nextInt();//정수

		if(!op.equals("+") && !op.equals("-") && !op.equals("*") 
				&& !op.equals("/") && !op.equals("%") ) {
			
			System.out.println("연산자 오류");
			System.exit(0);
		}

		int res = 0;
		if(op.equals("+")) {
			res = a+b;
		}else if(op.equals("-")) {
			res = a-b;
		}else if(op.equals("*")) {
			res = a*b;
		}else if(op.equals("/")) {
			res = a/b;
		}else if(op.equals("%")) {
			res = a%b;
		}
		
		System.out.printf("%d %s %d = %d \n", a,op,b,res);

	/*		
		if(res != 0) {
			System.out.printf("%d %s %d = %d \n", a,op,b,res);
			//System.out.println(a + op + b + "=" + res);
		}else {
			System.out.println("연산자 오류");
		}
*/		
		
	}

}
