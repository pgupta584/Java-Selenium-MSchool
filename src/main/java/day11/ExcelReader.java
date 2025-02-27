package day11;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        // Path to the Excel file
//        String excelFilePath = "TestData.xlsx";
		String excelFilePath = "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/fileDownloads/TestData.xlsx";


        // Create a file input stream to read the Excel file
        FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));

        // Create a workbook instance (for .xlsx files)
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the first sheet in the workbook
        Sheet sheet = workbook.getSheetAt(0); // 0 means the first sheet

        // Loop through the rows and columns to read data
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) { // Skip empty rows
                // Get the values in each column (assuming there are 3 columns)
                String username = row.getCell(0).getStringCellValue(); // Column 1
                String password = row.getCell(1).getStringCellValue(); // Column 2
                String expectedResults = row.getCell(2).getStringCellValue(); // Column 3

                // Print the values from each row
                System.out.println("username: " + username + ", password: " + password + ", expectedResults: " + expectedResults);
            }
        }

        // Close the workbook and file input stream
        workbook.close();
        fileInputStream.close();
    }
}
