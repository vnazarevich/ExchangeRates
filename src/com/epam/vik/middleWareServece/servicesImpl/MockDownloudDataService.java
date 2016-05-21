package com.epam.vik.middleWareServece.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import com.epam.vik.middleWareServece.models.ExchangeRate;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class MockDownloudDataService implements DownloadDataService{

	@Override
	public List<ExchangeRate> getData(String date) {
		return new ArrayList<ExchangeRate>(){{
			add (new ExchangeRate(5,"USD","dollars", 100, 800.));
			add (new ExchangeRate(5,"EURO","євро", 100, 900.));
		}};
	}

	

}
