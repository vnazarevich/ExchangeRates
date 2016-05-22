import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.models.Parameters;
import com.epam.vik.middleWareServece.services.AnalyzeDataService;
import com.epam.vik.middleWareServece.servicesImpl.AnalyzeDataServiceImpl;


public class TEST {

	public static void main(String[] args) {
		String dataTypeXLS = "xls";
		String dataTypeXML = "xml"; 
		Parameters param = new Parameters();
		
		param.setSelectedDownloadDataFormat(dataTypeXLS);
		AnalyzeDataService analyzer = new AnalyzeDataServiceImpl();
		List <Currency> result = analyzer.getAnalyzedData(param);
		System.out.println(dataTypeXLS);
		System.out.println(result);
		System.out.println();
		result=null;
		
		param.setSelectedDownloadDataFormat(dataTypeXML);
		analyzer = new AnalyzeDataServiceImpl();
		result = analyzer.getAnalyzedData(param);
		System.out.println(dataTypeXML);
		System.out.println(result);
		System.out.println();
		
//		JAXBContext jaxbContext;
//		try {
//			jaxbContext = JAXBContext.newInstance(Currency.class);
//			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			Currency currency = (Currency) jaxbUnmarshaller.unmarshal(new File("C:\\CDP\\search_results.xml"));
//			System.out.println(currency.toString());
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
/*
 * шаблон буд≥вельник
 * class A
 * setColor(Color c) has to return A?
 * or change method to addColor(Color c) ?
 */

/*
 * ќф≥ц≥йний курс валют 
 * http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily
 */
