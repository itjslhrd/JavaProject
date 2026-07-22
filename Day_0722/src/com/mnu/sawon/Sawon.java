package com.mnu.sawon;

public class Sawon {
	private int sabun;//사원번호
	private String name;//사원이름
	private int gender;//성별(1,3:남/2,4:여)
	private int grade;//사원등급
	private int time;//근무시간
	
	public Sawon() {}
	
	public Sawon(int sabun, String name, int gender, 
					int grade, int time) {
		this.sabun=sabun;
		this.name=name;
		this.gender=gender;
		this.grade=grade;
		this.time=time;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
