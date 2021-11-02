package com.collection.class26.task2;

public class FileTester {
    public static void main(String[] args) {
        File file1=new PDFFile();
        file1.open();
        file1.edit();
        file1.close();

        File [] file={new JavaFile(), new WordFile(), new PDFFile()};
        for (File value : file) {
            value.open();
            value.edit();
            value.close();
        }
    }
}
