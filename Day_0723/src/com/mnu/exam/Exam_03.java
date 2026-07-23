package com.mnu.exam;
class BB{
	int a;
	BB(int a){
		this.a=a;
	}
}

class ChBB extends BB{
	ChBB(){
		super(10);//조상클래스의 매개변수가 1개인 생성자 호출
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		ChBB cb = new ChBB();
		

	}

}
