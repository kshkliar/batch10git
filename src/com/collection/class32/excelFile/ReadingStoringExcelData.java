package com.collection.class32.excelFile;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingStoringExcelData {
    // we're still trying to store data from exel file
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\eclipse-workspace\\SDETJavaBatch10new\\Files\\TestFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        //data structure to use to store every object in new row
        ArrayList<Person> arrayList = new ArrayList<>();

        for (int i = 1; i < rowCount; i++) {
            String firstName = sheet.getRow(i).getCell(0).toString();
            String lastName = sheet.getRow(i).getCell(1).toString();
            String age = sheet.getRow(i).getCell(2).toString();
            // for each iterastion the object will be created and store to aary list
            // the data will be inserted in that object
            Person person = new Person(firstName, lastName, age);// data inserted in the object
            // for each iteration  proccess wiil repeated  for row #1 then row #2
            // and this object will be stored in the lisr
            // and once we stop iterating through list we printout arrayList
            arrayList.add(person);
        }
        // we need to override toString methods that called automatically if we do not override it
        System.out.println(arrayList);
    }
}
