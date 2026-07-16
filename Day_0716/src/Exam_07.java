
class AA{
	void aaa() {
		
	}
}
public class Exam_07 {
	// 1. 반환타입 X, 매개변수 X
	static void method_1() {
		
	}
	// 2. 반환타입 X, 매개변수 O
	static void method_2(int a, int b) {
		
	}
	// 3. 반환타입 O, 매개변수 X
	static int method_3() {
		
		return 1;//return 정수값또는 변수
	}
	//4. 반환타입 O, 매개변수 O
	static int method_4(int[] a) {
		
		return 1;////return 정수값또는 변수
	}
	public static void main(String[] args) {
		//1. 메소드 호출
		method_1();
		
		//2.
		method_2(100,2);
		
		//3.
		int s = method_3();

		//4.
		int ss[]= {1,2,3,4};
		int k = method_4(ss);
		
	}
	
//
}
