package com.mnu.sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		//키보드입력(사원정보)
		Scanner scn = new Scanner(System.in);
		System.out.print("사원등록:");
		int sabun = scn.nextInt();//사원번호
		String name = scn.next();//이름
		int gender = scn.nextInt();//성별
		int grade = scn.nextInt();//사원등급
		int time = scn.nextInt();//근무시간

		SawonDAO dao = SawonDAO.getInstance();
		//1. 사원 객체 생성
		Sawon sawon = dao.getSawon(sabun, name, gender, grade, time);
		
		//주간급여((1)등급에 따른 시급, 급여)
		int weekPay = 2000;
		if(sawon.getGrade()==1)
			weekPay = 10000;
		else if(sawon.getGrade()==2)
			weekPay = 5000;
		
		
		int weekMoney = dao.weekPayProcess(sawon, weekPay);
		
		//출력
		//성별계산
		String genderStr="여자";
		if(sawon.getGender()==1 || sawon.getGender()==3)
			genderStr="남자";
		System.out.println("사원번호\t이름\t성별\t등급\t"
									+ "시급\t근무시간\t주간급여");
		System.out.print(sawon.getSabun() + "\t");
		System.out.print(sawon.getName() + "\t");
		System.out.print(genderStr + "\t");
		System.out.print(sawon.getGrade() + "\t");
		System.out.print(weekPay + "\t");
		System.out.print(sawon.getTime() + "\t");
		System.out.print(weekMoney + "\n");
		
	}

}
