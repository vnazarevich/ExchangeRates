package com.epam.vik.middleWareServece.servicesImpl;

import java.io.IOException;
import java.util.List;

import utils.HttpDownloadUtility;

import com.epam.vik.middleWareServece.models.ExchangeRate;
import com.epam.vik.middleWareServece.services.DownloadDataService;

public class XMLDownloadDataServiceImpl implements DownloadDataService {

	@Override
	public List<ExchangeRate> getData(String date) {
		String fileURL = "http://www.bank.gov.ua/control/uk/curmetal/currency/search?formType=searchFormDate&time_step=daily&&date=13.05.2016&outer=xml";
        String saveDir = "C:/CDP";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return createListWithOriginalData();
	}

	private List<ExchangeRate> createListWithOriginalData() {
		
		return null;
	}

}
