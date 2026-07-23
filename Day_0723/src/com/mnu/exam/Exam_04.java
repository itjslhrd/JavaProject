package com.mnu.exam;
class CC{
	int a=10;
	void exam() {
		System.out.println("a=" + a);
	}
}
//final : 클래스 -> 상속불가, 메소드 -> 오버라이딩 불가, 변수->변경불가
class ChCC extends CC{
	int b=100;
	void test() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	//오버라이딩 : 재정의
	void exam() {
		super.exam();
		System.out.println("a=" + a);
	}
	void exam(int a) {
		System.out.println("a=" + a);
	}
	
}

public class Exam_04 {
	public static void main(String[] args) {

	}

}
