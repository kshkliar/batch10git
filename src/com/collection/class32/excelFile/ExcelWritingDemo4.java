package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo4 {
    public static void main(String[] args) throws IOException {

        // we want to retaine the data
        String path = "C:\\Users\\User\\Desktop\\Batch10\\MyOwnNewFile.xlsx";

      FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
      //  Sheet mySheet = xssfWorkbook.createSheet("MySheet");// will return sheet
       Sheet mySheet = xssfWorkbook.getSheet("MySheet");

        Row row = mySheet.createRow(7);// create te row
        Cell cell = row.createCell(7);// create cell
        cell.setCellValue("My First File"); // insert some data
       fileInputStream.close();// we should at first close file before you move to next operation like in excel
        FileOutputStream fileOutputStream = new FileOutputStream(path);// передали путь path

        xssfWorkbook.write(fileOutputStream);// writing this file

// execute code - new file created
    }
}
