package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelReadingDemo {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\User\\Desktop\\Batch10\\TestFile.xlsx"; //экранируем слеш  указываем путь к файлу
        FileInputStream fileInputStream = new FileInputStream(path);//add exeption

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);// in this case we do not use load method

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");// we navigated to sheet1
      //  now we need to navigate to row:
        Row row = sheet.getRow(1);// navigate to row
        //выводим на экран записи с нашего exel файла
        System.out.print(row.getCell(0)+" ");// navigate to sell in row
        System.out.print(row.getCell(1)+" ");// navigate to sell in row
        System.out.print(row.getCell(2)+" "+"\n");// navigate to sell in row

        System.out.println(row.getCell(0));// navigate to sell in row
        System.out.println(row.getCell(1));// navigate to sell in row
        System.out.println(row.getCell(2));
    }
}