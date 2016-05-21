package com.epam.vik.middleWareServece.models;

public class ExchangeRate {
	private int id;
	private String shortName;
	private String fullName;
	private int numberOfUnits;
	private double rate;
	
	public ExchangeRate(int id, String shortName, String fullName,
			int numberOfUnits, double rate) {
		super();
		this.id = id;
		this.shortName = shortName;
		this.fullName = fullName;
		this.numberOfUnits = numberOfUnits;
		this.rate = rate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getNumberOfUnits() {
		return numberOfUnits;
	}
	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ExchangeRate [id=" + id + ", shortName=" + shortName
				+ ", fullName=" + fullName + ", numberOfUnits=" + numberOfUnits
				+ ", rate=" + rate + "]" + "\n";
	}
	
	
}
