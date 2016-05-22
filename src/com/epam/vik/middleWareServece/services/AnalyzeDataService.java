package com.epam.vik.middleWareServece.services;

import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.models.Parameters;

public interface AnalyzeDataService {
	List <Currency> getAnalyzedData(Parameters param);

}
