package com.epam.vik.middleWareServece.services;

import java.util.List;

import com.epam.vik.middleWareServece.models.ExchangeRate;
import com.epam.vik.middleWareServece.models.Parameters;

public interface AnalyzeDataService {
	List <ExchangeRate> getAnalyzedData(Parameters param);

}
