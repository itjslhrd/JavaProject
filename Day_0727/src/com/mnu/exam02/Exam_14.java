package com.mnu.exam02;
interface CCC{

	public abstract void test();
	int a(int a, int b);
}

//인터페이스 구현하여 클래스 생성
class ExamCCC implements CCC{
	@Override
	public int a(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

interface CCC_1 extends CCC{
	void size();
}
public class Exam_14 {

	public static void main(String[] args) {
		//CCC c1 = new CCC();
		
		CCC c1 = new ExamCCC();
		
	}

}
