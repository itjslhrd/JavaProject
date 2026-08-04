package com.mnu.exam02;

public class ADto {
	int bun;
	String name;
	
	public ADto() {}
	public ADto(int b, String n) {
		bun=b;
		name=n;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
