package com.epam.vik.middleWareServece.models;

public class Currency {
	private String date;
	private int digitalCode;
	private String letterCode;
	private int numberOfUnits;
	private String currencyName;
	private double rate;
	public Currency(String date, int digitalCode, String letterCode, int numberOfUnits, String currencyName,
			double rate) {
		this.date = date;
		this.digitalCode = digitalCode;
		this.letterCode = letterCode;
		this.numberOfUnits = numberOfUnits;
		this.currencyName = currencyName;
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDigitalCode() {
		return digitalCode;
	}
	public void setDigitalCode(int digitalCode) {
		this.digitalCode = digitalCode;
	}
	public String getLetterCode() {
		return letterCode;
	}
	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Currency [date=" + date + ", digitalCode=" + digitalCode + ", letterCode=" + letterCode
				+ ", numberOfUnits=" + numberOfUnits + ", currencyName=" + currencyName + ", rate=" + rate + "]" +"\n";
	}
	
	
	
}
