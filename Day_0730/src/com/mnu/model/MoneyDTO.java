package com.mnu.model;

public class MoneyDTO {
	private int saleno;
	private int custno;
	private String pcode;
	private int amount;
	private int price;
	private String sdate;
	
	public MoneyDTO() {	}
	
	public MoneyDTO(int saleno, int custno, String pcode, int amount, int price) {
		this.saleno=saleno;
		this.custno=custno;
		this.pcode=pcode;
		this.amount=amount;
		this.price=price;
	}

	public int getSaleno() {
		return saleno;
	}

	public void setSaleno(int saleno) {
		this.saleno = saleno;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
}
