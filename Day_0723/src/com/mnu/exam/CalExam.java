package com.mnu.exam;

public class CalExam {
	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.add();//0+0=0
		c1.add(1,2);//1+2=3
		
		Cal c2 = new Cal(6);
		c2.add();//6+0=6
		c2.add(1,2);//1+2=3
		
		Cal c3 = new Cal(5,10);
		c3.add();//5+10=15
		c3.add(1,2);//1+2=3
		
	}

}
