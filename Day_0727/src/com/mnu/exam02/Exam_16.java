package com.mnu.exam02;
//익명 구현 객체
interface InterA{
	void exam(int a);
}

class ExAA implements InterA{
	@Override
	public void exam(int a) {
		System.out.println("a=" + a);
	}
}

public class Exam_16 {
	public static void main(String[] args) {
		ExAA a = new ExAA();
		a.exam(100);
		
		InterA a2 = new ExAA();
		a2.exam(10);

		//익명 구현객체 만들기
		InterA a3 = new InterA() {
			@Override
			public void exam(int a) {
				System.out.println("aaaa =' " + a);
			}
		};
		a3.exam(1000);
	
	}

}
