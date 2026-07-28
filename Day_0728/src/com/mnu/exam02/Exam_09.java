package com.mnu.exam02;
class Sawon{
	String name;
	void print() {
		try {
	      if(name.equals("aaaa")) {//예외발생
	         System.out.println("name="+name);
	      }else {
	         System.out.println("name=null");
	     }
		}catch(NullPointerException e){
			System.out.println("이름이 없으면 에러가 발생합니다");
		}
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		Sawon sa = new Sawon();
		sa.print();
	}
}
