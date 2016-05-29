import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;
import com.epam.vik.middleWareServece.models.Parameters;
import com.epam.vik.middleWareServece.services.AnalyzeDataService;
import com.epam.vik.middleWareServece.servicesImpl.AnalyzeDataServiceImpl;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TEST {
	
	@GET
	@Path("/main")
	//public static void main(String[] args) {
		public static List<Currency> main() {
		String dataTypeXLS = "xls";
		String dataTypeXML = "xml"; 
		Parameters param = new Parameters();
		param.setDate("13.05.2016");
		
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
		return result;
		
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
