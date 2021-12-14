package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadingDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\eclipse-workspace\\SDETJavaBatch10new\\Files\\TestFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);// to read the data we need this file
// separate file to handle excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);// specific program that handle excel and
        // we pass fileInputStream to this programm as a argument - parameter to handle with
//  To navigate to sheet1 getting sheet1
        Sheet sheet = xssfWorkbook.getSheet("Sheet1"); // first we need to get to this sheet and pass this sheet name
        //give me exact numbers of rows that contains the data:
        int rowCount = sheet.getPhysicalNumberOfRows();// method will return actual number off rows that contains the data

        for (int i = 0; i < rowCount; i++) {
            int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();//нам показать сколько ячеек этого ряда имеют данные(how many rows contains the data

            for (int j = 0; j < cellCount; j++) {
                //from this sheet give me first row and get 1 cell in first iteration
                System.out.print(sheet.getRow(i).getCell(j) + " ");//i -rows cells - j
            }
            System.out.println();
        }

    }
}
