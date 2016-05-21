package com.epam.vik.middleWareServece.servicesImpl;

import java.util.List;

import com.epam.vik.middleWareServece.models.ExchangeRate;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class XLSDownloadDataServiceImpl implements DownloadDataService {

	@Override
	public List<ExchangeRate> getData(String date) {
		return new MockDownloudDataService().getData(date);
	}

}
