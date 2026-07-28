package com.mnu.exam02;
class Sawon2{
	String name;
	//예외처리를떠넘기다
	//throws: 미루기
	//throw : 예외발생
	void print() throws NullPointerException {
	      if(name.equals("aaaa")) {//예외발생
	         System.out.println("name="+name);
	      }else {
	         System.out.println("name=null");
	     }
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Sawon2 sa = new Sawon2();
		try {
			sa.print();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
