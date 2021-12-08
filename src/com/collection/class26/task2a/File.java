package com.collection.class26.task2a;

public abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while
    open is an abstract. Create 3 subclasses: JavaFile, WordFile,
    PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc
    file we need Microsoft word to be installed etc
     */
    abstract void open();

    void edit() {
        System.out.println("Editing the file");
    }

    void close() {
        System.out.println();
    }

}
class JavaFile extends File {
    void open() {
        System.out.println("Use Intellij To open this file");
    }

}
class PDFFile extends File implements UploadAble, DownloadAble {

    void open() {
        System.out.println("Use Adobe PDF Reader to open this File");
    }

    public void download() {
        System.out.println("Downloading the file");
    }

    @Override
    public void upload() {
        System.out.println("You can download this file as well ");
    }
}

class WordFile extends File {
    void open() {
        System.out.println("Use MS Word to open this file");
    }
}