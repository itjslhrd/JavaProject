package com.mnu.exam;
//계산기 클래스
//접근제어자 : private,아무것도안붙임, protected, public
public class Cal {
	private int a;//멤버변수(인스턴수 변수)
	private int b;
	//int c;//디폴트
	//생성자(클래스 이름과 동일한 메소드(), 반환타입 없음)
	//오버로딩 : 이름은 같고, 매개변수 (개수, 타입, 순서)
	public Cal(){}
	public Cal(int a) {
		this.a=a;
		//b=a;
	}
	public Cal(int a, int b) {
		this.a=a;
		this.b=b;
	}
	// 기능 메소드
	public void add() {
		int result = a + b;
		System.out.printf("%d + %d = %d\n", a,b,result);
	}
	public void add(int a, int b) {
		int result = a + b;
		System.out.printf("%d + %d = %d\n", a,b,result);
	}
	public void add(double a, double b) {
		double result = a + b;
		System.out.printf("%f + %f = %f\n", a,b,result);
	}
	public void add(int a, double b) {
		double result = a + b;
		System.out.printf("%d + %f = %f\n", a,b,result);
	}
	public void add(double a, int b) {
		double result = a + b;
		System.out.printf("%f + %d = %f\n", a,b,result);
	}
	
	
}
