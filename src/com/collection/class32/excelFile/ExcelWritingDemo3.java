package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo3 {
    public static void main(String[] args) throws IOException {

        // we want to create new file in same folder
        String path = "C:\\Users\\User\\Desktop\\Batch10\\MyOwnNewFile.xlsx";

      //  FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet mySheet = xssfWorkbook.createSheet("MySheet");// will return sheet
       // Sheet mySheet = xssfWorkbook.getSheet("MySheet");

        Row row = mySheet.createRow(5);// create te row
        Cell cell = row.createCell(5);// create cell
        cell.setCellValue("My First File"); // insert some data
       // fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(path);// передали путь path pass the pass

        xssfWorkbook.write(fileOutputStream);// writing this file  should be the last line

// execute code - new file created successfully
    }
}
