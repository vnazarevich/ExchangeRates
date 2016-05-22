package com.epam.vik.middleWareServece.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class MockDownloudDataService implements DownloadDataService{

	@Override
	public List<Currency> getData(String date) {
		return new ArrayList<Currency>(){{
			add (new Currency("12.13.16", 5,"USD",100,"dollars",  800.));
			add (new Currency("12.13.16", 5,"EURO",100,"євро",  900.));
		}};
	}

	

}
