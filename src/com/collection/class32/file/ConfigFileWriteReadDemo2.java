package com.collection.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteReadDemo2 {
    public static void main(String[] args) throws IOException {
        String readPath="C:\\Users\\User\\eclipse-workspace\\JavaLessons\\Files\\Config1.properties";
        String writePath="C:\\Users\\User\\eclipse-workspace\\JavaLessons\\Files\\Config.properties";

       /* String[] arr={"hi"};
        main(arr);*/
        FileInputStream fileInputStream=new FileInputStream(readPath);//reading the data
        FileInputStream fileInputStream1=new FileInputStream(writePath); //writing the data to other file

// сначала сохраняем данные что бы они не потерялись :
        Properties properties1=new Properties();
        properties1.load(fileInputStream1);

        Properties properties=new Properties();
        properties.load(fileInputStream);

        String URL=properties.get("URL").toString();//extrct the da from URL

        properties1.put("URL",URL);

        FileOutputStream fileOutputStream=new FileOutputStream(writePath);// this file(line) must be last step to save the data
        properties1.store(fileOutputStream,"Some Comments");
// to execute this code first data in gonfig must be saved ( not overriden should not go away) and data from file Config1 passed to config
        //Break till 1:45

/*URL=www.google.com
Name=Bogdan
Password=Admin   // all data alltogether
UserName=Admin*/
    }
}
