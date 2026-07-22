package com.mnu.sawon2;

public class SawonDAO {
	//싱글톤 패턴
	private SawonDAO() {}
	//자신의 객체를 자신이 생성
	private static SawonDAO instance = new SawonDAO();
	public static SawonDAO getInstance() {
		return instance;
	}
	
	//1. 메소드 생성(객체 생성 후 반환)
	public SawonDTO getSawon(int sabun, String name, int gender, 
						int grade, int time) {
		//Sawon sawon = new Sawon();
		//sawon.setSabun(sabun);
		// . .  . .
		SawonDTO sawon = new SawonDTO(sabun, name, gender, grade, time);
		return sawon;
	}
	//2. 성별을 구하여 반환하는 메소드
	
	//3. 주간급여를 계산 후 반환하는 메소드
	public void weekPayProcess(SawonDTO sa) {
		//등급에 따름 시급
		setWeekPay(sa);
		//성별 체크
		setGender(sa);
		
		int pay = 0;//주간급여
		int overTime = 0;//초과근무시간
		int baseTime = sa.getTime();// 45
		if(baseTime>50)
			baseTime=50;
		//초과근무시간
		if(baseTime>36) { 
			overTime = baseTime-36;
			baseTime = 36;
		}
		pay = baseTime*sa.getWeekPay() + (int)(overTime*sa.getWeekPay()*1.5);
		
		//return pay;
	}
	
	private void setWeekPay(SawonDTO sa) {
		sa.setWeekPay(2000);
		if(sa.getGrade()==1)
			sa.setWeekPay(10000);
		else if(sa.getGrade()==2)
			sa.setWeekPay(5000);		
	}
	
	private void setGender(SawonDTO sa) {
		sa.setGenderStr("여자");
		if(sa.getGender()==1 || sa.getGender()==3)
			sa.setGenderStr("남자");
	}
}
