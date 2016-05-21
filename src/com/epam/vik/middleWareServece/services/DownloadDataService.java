package com.epam.vik.middleWareServece.services;

import java.util.List;

import com.epam.vik.middleWareServece.models.ExchangeRate;

public interface DownloadDataService {
	List<ExchangeRate> getData(String date);
}
