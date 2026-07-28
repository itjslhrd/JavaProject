package com.mnu.exam01;

public class Exam_11 {

	public static void main(String[] args) {
        Exam_11 a1 = new Exam_11();
        Over2 a2 = new Over2();
        int r = a1.sun(3, 2)+a2.sun(3, 2);
        System.out.println(r);

	}
    int sun(int x, int y) {
        return x+y;
   }

}

class Over2 extends Exam_11{
    int sun(int x, int y) {
         return x-y + super.sun(x, y);
    }
}
