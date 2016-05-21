package com.epam.vik.middleWareServece.models;

import java.util.Date;
import java.util.Set;

public class Parameters {
	private String date;
	private String baseCurrency;
	private Set<String> currenciesList;
	private String selectedDownloadDataFormat;

	public Parameters() {
		baseCurrency = "UAH";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public Set<String> getCurrenciesList() {
		return currenciesList;
	}

	public void setCurrenciesList(Set<String> currenciesList) {
		this.currenciesList = currenciesList;
	}

	public String getSelectedDownloadDataFormat() {
		return selectedDownloadDataFormat;
	}

	public void setSelectedDownloadDataFormat(String selectedDownloadDataFormat) {
		this.selectedDownloadDataFormat = selectedDownloadDataFormat;
	}

	
	@Override
	public String toString() {
		return "Parameters [date=" + date + ", baseCurrency=" + baseCurrency
				+ ", currenciesList=" + currenciesList
				+ ", selectedDownloadDataFormat=" + selectedDownloadDataFormat
				+ "]";
	}

}
