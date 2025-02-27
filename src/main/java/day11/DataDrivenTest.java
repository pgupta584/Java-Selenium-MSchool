package day11;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// Read the Data from Excel and Print
		String inputData = "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/fileDownloads/TestData.xlsx";
		
		FileInputStream fis = new FileInputStream(inputData);
		
		// Create WorkBook Object
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		for(Row row: sheet) {
			for (Cell cell: row) {
				System.out.println(cell.getStringCellValue());
			}
		}
	}
}
