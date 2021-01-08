package com.bancomaya.clientes.model;

public class DigitalCard {

	private int id;
	private String bank;
	private String customer;
	private String number;
	private String expirationDate;
	private String secureNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecureNumber() {
		return secureNumber;
	}
	public void setSecureNumber(String secureNumber) {
		this.secureNumber = secureNumber;
	}
	
}
