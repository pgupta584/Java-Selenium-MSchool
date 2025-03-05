package day13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidorTest2 {
	
	@DataProvider(name = "excelData")
	public Object[][] getDataFromExcel() throws IOException {
		String path = "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/SimpleData.xlsx";
	    FileInputStream fis = new FileInputStream(path);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wb.getSheetAt(0);

	    int rowCount = sheet.getPhysicalNumberOfRows();
	    int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

	    Object[][] data = new Object[rowCount][colCount];

	    for (int i = 0; i < rowCount; i++) {
	        for (int j = 0; j < colCount; j++) {
	            data[i][j] = sheet.getRow(i).getCell(j).toString();
	        }
	    }
	    return data;
	}

	@Test(dataProvider = "excelData")
	public void testFromExcel(String param1, String param2) {
	    System.out.println("Test Data: " + param1 + ", " + param2);
	}

}
