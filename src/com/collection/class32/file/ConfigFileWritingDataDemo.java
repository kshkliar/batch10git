package com.collection.class32.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDataDemo {

    public static void main(String[] args) throws IOException {

        //Path where I want to create the file on my computer( new file):
        String path="C:\\Users\\User\\eclipse-workspace\\JavaLessons\\Files\\Config1.properties";

       // Navigating to the path and creating a new file:
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        //opening the specific program and putting the data:
        Properties properties=new Properties();
        properties.put("URL","www.google.com");//put some data in here

        //saving changes to that file:
        properties.store(fileOutputStream,"new data added");

    }
}
