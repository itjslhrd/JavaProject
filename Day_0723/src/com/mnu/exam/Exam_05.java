package com.mnu.exam;
class DD{
	int a=10;
	void exam() {
		System.out.println("a=" + a);
	}
}
class ChDD extends DD{
	int b=20;
	//오버라이딩
	void exam() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	void test() {
		//super.exam();
		System.out.println("b=" + b);
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		DD d = new ChDD();//업케스팅
		System.out.println("a= " + d.a);
		//System.out.println("b= " + d.b);
		
		d.exam();//누구것인가?( 오버라이딩된 메소드가 호출됨)
	}

}
