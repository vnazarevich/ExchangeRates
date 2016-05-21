package com.epam.vik.middleWareServece.servicesImpl;

import java.util.List;

import com.epam.vik.middleWareServece.models.ExchangeRate;
import com.epam.vik.middleWareServece.models.Parameters;
import com.epam.vik.middleWareServece.services.AnalyzeDataService;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class AnalyzeDataServiceImpl implements AnalyzeDataService {
	private DownloadDataService dataService;

	@Override
	public List<ExchangeRate> getAnalyzedData(Parameters param) {
		switch (param.getSelectedDownloadDataFormat()) {
		case "xml":
			dataService = new XMLDownloadDataServiceImpl();
			break;
		case "xls":
			dataService = new XLSDownloadDataServiceImpl();
			break;
		}
		return dataService.getData(param.getDate());
	}

}
