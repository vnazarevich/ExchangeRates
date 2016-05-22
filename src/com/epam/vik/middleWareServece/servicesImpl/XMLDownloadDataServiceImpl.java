package com.epam.vik.middleWareServece.servicesImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import utils.FileParserUtil;
import utils.HttpDownloadUtility;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class XMLDownloadDataServiceImpl implements DownloadDataService {

	@Override
	public List<Currency> getData(String date) {
		String fileURL = "http://www.bank.gov.ua/control/uk/curmetal/currency/search?formType=searchFormDate&time_step=daily&&date=13.05.2016&outer=xml";
        String saveDir = "C:/CDP";
        File file = null;
        try {
            file = HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return createListWithOriginalData(file);
	}

	private List<Currency> createListWithOriginalData(File file) {
		FileParserUtil parser = new FileParserUtil();
		return parser.createOriginalDataList(file);
	}

}
