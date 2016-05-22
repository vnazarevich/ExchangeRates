package com.epam.vik.middleWareServece.services;

import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;

public interface DownloadDataService {
	List<Currency> getData(String date);
}
