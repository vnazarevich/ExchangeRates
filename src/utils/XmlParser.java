package utils;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.vik.middleWareServece.models.Currency;
 
public class XmlParser extends DefaultHandler {
 
    private List<Currency> currencyList = null;
    private Currency currency = null;
 
    public List<Currency> getCurrencyList() {
        return currencyList;
    }
 
    boolean bDate = false;
    boolean bDigitalCode = false;
    boolean bLetterCode = false;
    boolean bNumberOfUnits = false;
    boolean bCurrencyName = false;
    boolean bRate = false;
 
 
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
 
        if (qName.equalsIgnoreCase("Currency")) {
            //create a new Currency and put it in Map
        //    String id = attributes.getValue("id");
            //initialize Currency object and set id attribute
            currency = new Currency();
   //         currency.setId(Integer.parseInt(id));
            //initialize list
            if (currencyList == null)
                currencyList = new ArrayList<>();
        } else if (qName.equalsIgnoreCase("digital_code")) {
            //set boolean values for fields, will be used in setting Currency variables
            bDigitalCode = true;
        } else if (qName.equalsIgnoreCase("date")) {
            bDate = true;
        } else if (qName.equalsIgnoreCase("letter_code")) {
            bLetterCode = true;
        } else if (qName.equalsIgnoreCase("number_of_units")) {
            bNumberOfUnits = true;
        } else if (qName.equalsIgnoreCase("exchange_rate")) {
            bRate = true;
        } else if (qName.equalsIgnoreCase("currency_name")) {
        	bCurrencyName = true;
        }
        
    }
 
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Currency")) {
            //add Currency object to list
            currencyList.add(currency);
        }
    }
 
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
 
        if (bDate) {
            //age element, set Currency age
            currency.setDate(new String(ch, start, length));
            bDate = false;
        } else if (bDigitalCode) {
            currency.setDigitalCode(Integer.parseInt(new String(ch, start, length)));
            bDigitalCode = false;
        } else if (bNumberOfUnits) {
            currency.setNumberOfUnits(Integer.parseInt(new String(ch, start, length)));
            bNumberOfUnits = false;
        } else if (bLetterCode) {
            currency.setLetterCode(new String(ch, start, length));
            bLetterCode = false;
        } else if (bRate) {
            currency.setRate(Double.parseDouble(new String(ch, start, length)));
            bRate = false;
        } else if (bCurrencyName) {
            currency.setCurrencyName(new String(ch, start, length));
            bCurrencyName = false;
        }
    }
}
