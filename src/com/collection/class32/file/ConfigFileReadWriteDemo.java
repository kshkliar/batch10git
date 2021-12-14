package com.collection.class32.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadWriteDemo {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\User\\eclipse-workspace\\JavaLessons\\Files\\Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);// to read the data

        Properties properties = new Properties();// class to interact with file
        properties.load(fileInputStream);// method

        System.out.println(properties.get("UserName"));// reading existing dats
        System.out.println(properties.get("Password"));

        properties.put("Name", "Bogdan");// key and value    write the new data  Name=Bogdan

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        properties.store(fileOutputStream, "Name added to this file");
    }
}
