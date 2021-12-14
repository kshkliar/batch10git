package com.collection.class33.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {
//To cancatinate path we have a special Class getProperty
        String path=System.getProperty("user.dir")+"\\Files\\Task1.properties";//  we copy by Path from content root and out backwards slashes

        System.out.print(System.getProperty("user.dir"));//   this method to give us path dynamically
        System.out.println(" our path that we have above -getProperty(user.dir- give us that");
        System.out.println(path+ " The same ");// now the shortened path is appeared  -color well be changet to blue color

        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties=new Properties();

            properties.load(fileInputStream);

        System.out.println(properties.get("browser"));//get properties from config file
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
     //   fileInputStream.close();
        System.out.println("Important line of code");

    }
}
