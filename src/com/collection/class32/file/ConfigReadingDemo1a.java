package com.collection.class32.file;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReadingDemo1a {
    public static void main(String[] args) throws IOException {
//location of the file:
        String path = "C:\\Users\\User\\eclipse-workspace\\JavaLessons\\Files\\Config.properties";
        //we need to navigate to these properties, for this we have following FileInputStream:
        // to have connection to this file we have class
        //creating a connection between class or navigation to that file
        FileInputStream fileInputStream=new FileInputStream(path);// path - passed we to parameter
        // connection created automaticle  ( if exeption is shown  yoy must add exeption to method signaturethrows IOException;
        //Now we ned a proggrame/ class that we iteract with this file, this program is Properties class:
        //Properties  extends from HashTable
        //Choosing progrann to open file:
        Properties properties=new Properties();
        // now we need to load this file  we put this into parameter ( also add exeption to method signation
        //Java предупреждает что если нету этого файла мы длбавляем это исклюбчение

       // XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //in properties files data stores in form of keys and values like in your maps
        ////UserName=Key  Password=Value -exectly the same as in Maps

        //opening the file:
        properties.load(fileInputStream);
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));

       /* Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));
        System.out.println(row.getCell(2));*/
    }
}

