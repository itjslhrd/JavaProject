package com.mnu.exam03;

public class Test_01 {
	public static void main(String[] args) {
		String ssn = "050207-3234567";
		    //        01234567
		String date="991202";//"90-11-12"
		//년, 월, 일
		String year = ssn.substring(0,2);//0부터 2전까지 "91"
		String mon = ssn.substring(2,4);//"02"
		String day = ssn.substring(4,6);//"07"
		//성별
		int s = ssn.charAt(7)-48;//char -> 'A' => 65
		System.out.println("성별 : " + s);
		int ss = Integer.parseInt(ssn.substring(7,8));
		//나이 ?
		
		if(s==1 || s==2) {
			int age = 2026 - (1900+Integer.parseInt(year));
			System.out.println("나이 : " + age);
		}else {
			int age = 2026 - (2000+Integer.parseInt(year));
			System.out.println("나이 : " + age);
		}
		
	}

}
