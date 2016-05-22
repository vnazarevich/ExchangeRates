package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.epam.vik.middleWareServece.models.Currency;

public class FileParserUtil {
	private String fileContent;
	public List<Currency> createOriginalDataList(File file) {
		parseFile(file);
		createListResult();

		return null;
	}
	private void createListResult() {
		
		
	}
	private void parseFile(File file) {
		String line = null;
		StringBuffer stBuf = new StringBuffer();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			while ((line = reader.readLine()) != null) {
				stBuf.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		fileContent = stBuf.toString();		
	}

}
