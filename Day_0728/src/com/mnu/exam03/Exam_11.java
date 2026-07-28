package com.mnu.exam03;
class AA{
	int a;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return true;
		}else {
			return false;
		}
	}
}
class BB{
	
}
public class Exam_11 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		BB b1 = new BB();
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		if(a1==a2) {// 주소가 같은가?
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
		if(a1.equals(a2)) {
			System.out.println("같은 객체 임");
		}else {
			System.out.println("다른 객체 임");
		}

		if(a1.equals(b1)) {
			System.out.println("같은 객체 임");
		}else {
			System.out.println("다른 객체 임");
		}

	}

}
