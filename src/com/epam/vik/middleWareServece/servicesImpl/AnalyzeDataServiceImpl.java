package com.epam.vik.middleWareServece.servicesImpl;

import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.models.Parameters;
import com.epam.vik.middleWareServece.services.AnalyzeDataService;
import com.epam.vik.middleWareServece.services.DownloadDataService;

import utils.XMLParserSAX;

public class AnalyzeDataServiceImpl implements AnalyzeDataService {
	private DownloadDataService downloadDataService;
	private List<Currency> origrnalCurrencyList;

	@Override
	public List<Currency> getAnalyzedData(Parameters param) {
		String date = param.getDate();
		switch (param.getSelectedDownloadDataFormat()) {
		case "xml":
			downloadDataService = new XMLDownloadDataServiceImpl();
			downloadDataService.getData(date);
			origrnalCurrencyList = XMLParserSAX.getOriginalCurrencyList();
			break;
		case "xls":
			downloadDataService = new XLSDownloadDataServiceImpl();
			origrnalCurrencyList = downloadDataService.getData(param.getDate());
			break;
		}
		return origrnalCurrencyList;
	}

}
