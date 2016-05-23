package com.epam.vik.middleWareServece.services;

import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;

public interface DownloadDataService {
	public static final String SAVE_DIR = "C:/CDP";
	List<Currency> getData(String date);
}
