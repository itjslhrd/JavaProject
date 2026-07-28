package com.mnu.exam01;
class Parent{
    void show() {
         System.out.println("Parent");
    }
    void test() {
    	
    }
}
class Child extends Parent{
	//오버라이딩
    void show() {
         System.out.println("Child");
    }
    void aaa() {
    	
    }
}
public class Exam_10 {
	public static void main(String[] args) {
		Parent pa1 = new Parent();
		pa1.show();
		
		Parent pa = new Child();
        pa.show();
       // pa.aaa();
        
        
        Child ch = new Child();
        ch.show();


	}

}
