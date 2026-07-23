package com.mnu.exam;
class Super{
	private int a=10;//상속불가
	int b=100;
}

class Child extends Super{
	int b=50;
	int d=10;

	void test() {
		System.out.println("Super.b=" + super.b);//100
		System.out.println("b=" + b);//50
		System.out.println("d=" + d);
	}
}

public class Ecam_01 {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println("s1.b = " + s1.b);//100
		
		Child c1 = new Child();
		System.out.println("c1.b = " + c1.b);//100
		System.out.println("c1.d = " + c1.d);//10
		System.out.println("--------------------");
		c1.test();//b=100, d=10
		
	}

}
