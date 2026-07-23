package com.mnu.exam;
class EE{
	
}
class ChEE extends EE{
	
}
public class Exam_07 {
	public static void main(String[] args) {
		EE e = new ChEE();
		//객체 타입 확인 instanceof 연산자
		
		if(e instanceof ChEE) {
			System.out.println("같은 타입 임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("타입dl 다름");
		}

		if(e instanceof EE) {
			System.out.println("같은 타입 임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("타입dl 다름");
		}

	}

}
