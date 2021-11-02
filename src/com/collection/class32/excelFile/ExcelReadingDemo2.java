package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadingDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\User\\eclipse-workspace\\SDETJavaBatch10new\\Files\\TestFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rowCount=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+" ");
            }
            System.out.println();
        }

    }
}
