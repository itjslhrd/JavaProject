package com.mnu.exam01;
interface Number{
	   int add(int[] v, boolean odd);
}

class NaturalNumber implements Number{
	   public int add(int[] v, boolean odd) {
	      int sum=0;
	      for(int i=0; i<v.length; i++) {
	         if((odd && v[i]%2!=0) || (!odd && v[i]%2==0))
	            sum += v[i];
	      }
	      return sum;
	   }
}
public class Exam_06 {
	public static void main(String[] args) {
	      int v[]= {1,2,3,4,5,6,7,8,9};
	      NaturalNumber num = new NaturalNumber();
	      System.out.print(num.add(v, true)+ "," + num.add(v, false));
	}

}
