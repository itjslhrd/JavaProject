package com.mnu.model;

public class GoodsDTO {
	private String pcode;
	private String pname;
	private int pcost;
	private int stock;
	
	public GoodsDTO() {}
	
	public GoodsDTO(String pcode, String pname, int pcost, int stock) {
		this.pcode=pcode;
		this.pname=pname;
		this.pcost=pcost;
		this.stock=stock;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
