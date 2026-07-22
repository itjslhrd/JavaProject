package com.mnu.sawon;

public class SawonDAO {
	//싱글톤 패턴
	private SawonDAO() {}
	//자신의 객체를 자신이 생성
	private static SawonDAO instance = new SawonDAO();
	public static SawonDAO getInstance() {
		return instance;
	}
	
	//1. 메소드 생성(객체 생성 후 반환)
	public Sawon getSawon(int sabun, String name, int gender, 
						int grade, int time) {
		//Sawon sawon = new Sawon();
		//sawon.setSabun(sabun);
		// . .  . .
		Sawon sawon = new Sawon(sabun, name, gender, grade, time);
		return sawon;
	}
	//2. 성별을 구하여 반환하는 메소드
	
	//3. 주간급여를 계산 후 반환하는 메소드
	public int weekPayProcess(Sawon sa, int weekPay) {
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
		pay = baseTime*weekPay + (int)(overTime*weekPay*1.5);
		
		return pay;
	}
	
	
}
