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
		switch (param.getSelectedDownloadDataFormat()) {
		case "xml":
			downloadDataService = new XMLDownloadDataServiceImpl();
			origrnalCurrencyList = XMLParserSAX.getOriginalCurrencyList();
			break;
		case "xls":
			downloadDataService = new XLSDownloadDataServiceImpl();
			break;
		}
		//returndownloadDataService.getData(param.getDate());
		return origrnalCurrencyList;
	}

}
