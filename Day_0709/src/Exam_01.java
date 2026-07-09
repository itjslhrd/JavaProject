/*  자바 기본타입 : 8가지
 *  논리 : boolean(1Byte) : true / false
 *  정수 : byte(1),short(2), char(2), int(4), long(8)
 *  실수 : float(4), double(8)
 *  형변환(자동, 강제)
 *  참조타입 : 클래스(String), 배열
 */

public class Exam_01 {
	public static void main(String[] args) {
		boolean bool = true; //true/false
		byte by = 120; //-128 ~ 127
		//byte by2 = 130;
		short sh1 = 12345; //-32000 ~ 32000
		//short sh2 = 'a';
		//char ch1 = 66000; //0 ~ 65000
		char ch1 = 65; //0 ~ 65000
		char ch2 = 'A';
		
		int in1 = 700000; // -20억 ~ 20억
		int in2 = 'A';//자동 형변환
		int in3 = 65;
		
		//float fl1 = 3.14;//실수의 기본은 double
		float fl2 = 3.14f;
		float fl3 = (float)3.14;// 강제 형변환
		
		double do1 = 3.14;
		
		System.out.println("bool = " + bool);
		System.out.println("by = " + by);
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("in1 = " + in1);
		System.out.println("in2 = " + in2);
		System.out.println("in3 = " + in3);
		System.out.println("fl2 = " + fl2);
		System.out.println("fl3 = " + fl3);
		System.out.println("do1 = " + do1);
		
	}

}
