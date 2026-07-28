package com.mnu.exam01;

public class Exam_03 {

    public static void main(String[] args) {
        System.out.println(Exam_03.check(1));
  }

   static String  check(int num) {
        return (num>=0) ? "POSTIVE": "NEGATIVE";
   }

}

//실행결과  “POSTIVE”