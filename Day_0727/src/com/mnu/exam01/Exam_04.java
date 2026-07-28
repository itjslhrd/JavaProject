package com.mnu.exam01;

public class Exam_04 {

    public static void main(String[] args) {
    	Exam_04 ex4 = new Exam_04();
        System.out.println(ex4.check(1));
  }

   String  check(int num) {
        return (num>=0) ? "POSTIVE": "NEGATIVE";
   }

}

//실행결과  “POSTIVE”