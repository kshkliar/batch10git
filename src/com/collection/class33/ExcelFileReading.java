package com.collection.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\Batch10\\TestFile.xlsx";
        // System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();//count the number of rows that contains data
        ArrayList<Map<String, String>> mapArrayList = new ArrayList<>();

        for (int i = 1; i < rowCount; i++) {// get access to rows

            LinkedHashMap linkedHashMap = new LinkedHashMap();

            int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {// access to cells  we start another loop

                System.out.print(sheet.getRow(i).getCell(j) + " ");

                // now we want to store data inside the list of map
           //     for each row we nneed to create new map, then we need to store the map in the list, arrayList
                //This list will contain the map and map will contain thee strings from excel
                //nested data structure
                // if we need map for each roe we need to write code in this scope inside the outer loop( inner)
                linkedHashMap.put(sheet.getRow(0).getCell(j).toString(),// when we pass 0 we got keys row#0
                        sheet.getRow(i).getCell(j).toString());// for the values we write (pass) i and j one by one


            }
            mapArrayList.add(linkedHashMap);// we stored linkedHashMap to mapArrayList

            System.out.println();
            //      System.out.println();
        }

        System.out.println(mapArrayList);// to print mapArrayList

    }
}
