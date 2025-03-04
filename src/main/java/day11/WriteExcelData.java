package day11;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteExcelData {
    public static void main(String[] args) {
        // Create a new workbook (XSSFWorkbook for .xlsx format)
        Workbook workbook = new XSSFWorkbook();
        
        // Create a new sheet in the workbook
        Sheet sheet = workbook.createSheet("Simple Data");

        // Create the first row (row 0)
        Row row = sheet.createRow(0);

        // Create cells and set values in the first row
        row.createCell(0).setCellValue("Name");  // Column 1: Name
//        row.createCell(1).setCellValue("Age");   // Column 2: Age
//
//        // Create second row (row 1) to add some data
//        row = sheet.createRow(1);
//        row.createCell(0).setCellValue("Pankaj");
//        row.createCell(1).setCellValue(30);
//
//        // Create third row (row 2) to add another data
//        row = sheet.createRow(2);
//        row.createCell(0).setCellValue("Paras");
//        row.createCell(1).setCellValue(25);

        // Write the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/fileDownloads/SimpleData.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();  // Close the workbook to release resources
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

