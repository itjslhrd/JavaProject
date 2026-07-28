package com.mnu.exam03;
class CC{
	int bun;
	String name;
	CC(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return bun + name;
	}
}
public class Exam_12 {
	public static void main(String[] args) {
		CC c1 = new CC(1,"김학생");
		String na = new String("김학생");
		
		System.out.println("c1 = " + c1);
		System.out.println("na = " + na);
	}
}
