package com.mnu.exam01;

class AA {
	int bun=10;
	String name="홍길동";
	
	@Override
	public String toString() {
		return "AA 객체입니다";
	}
}
//==, equals()
public class Exam_01 {
	public static void main(String[] args) {
		String str = new String("AAAAA");
		AA a = new AA();
		
		System.out.println("str=" + str);
		System.out.println("a=" + a);
	}

}
