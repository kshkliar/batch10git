package com.collection.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo1 {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path="C:\\Users\\User\\eclipse-workspace\\SDETJavaBatch10new\\Files\\Config.properties";
        //creating a connection between class or navigation to that file
        FileInputStream fileInputStream=new FileInputStream(path);
        //choosing a program to open thatfile
        Properties properties=new Properties();
        //opening the file
        properties.load(fileInputStream);
        //Reading the Data
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));



    }
}
