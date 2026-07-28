package com.mnu.exam02;
abstract class AA{
	int a=10;
	void test() {
		
	}
	abstract void add(int a, int b);
}

class SubAA extends AA{
	@Override//어노테이
	void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_12 {

	public static void main(String[] args) {
		//AA a = new AA();
		AA a = new SubAA();
		

	}

}
