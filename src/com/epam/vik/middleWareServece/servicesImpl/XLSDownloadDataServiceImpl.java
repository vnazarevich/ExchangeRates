package com.epam.vik.middleWareServece.servicesImpl;

import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class XLSDownloadDataServiceImpl implements DownloadDataService {

	@Override
	public List<Currency> getData(String date) {
		return new MockDownloudDataService().getData(date);
	}

}
