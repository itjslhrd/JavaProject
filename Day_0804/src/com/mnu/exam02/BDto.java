package com.mnu.exam02;

public class BDto {
	int bun;
	int kor,eng,mat;
	public BDto() {}
	public BDto(int b, int k, int e, int m) {
		bun=b;
		kor=k;
		eng=e;
		mat=m;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}
