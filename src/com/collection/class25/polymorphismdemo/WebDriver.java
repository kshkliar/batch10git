package com.collection.class25.polymorphismdemo;

public  class WebDriver {
    void openBrowser(){
        System.out.println("Opening browser");
    }
    void loadWebsite(String website){
        System.out.println("load the website inside the browser");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order");
    }
    void TestFileDownload(){
        System.out.println("Testing file download");
    }
    void closeBrowser(){
        System.out.println("Close browser");
    }
}
class GoogleChrome extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in Google Chrome");
    }
    void loadWebsite(String website){
        System.out.println("load the website inside the browser using Google Chrome"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Google Chrome");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in Google Chrome");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Close browser in Google Chrome");
    }
}
class FireFox extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in FireFox");
    }
    void loadWebsite(String website){
        System.out.println("load the website inside the browser using FireFox");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in FireFox");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in FireFox");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in FireFox");
    }
    void closeBrowser(){
        System.out.println("Close browser in FireFox");
    }
}

class Safari extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in Safari");
    }
    void loadWebsite(String website){
        System.out.println("load the website inside the browser using Safari");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Safari");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in Safari");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in Safari");
    }
    void closeBrowser(){
        System.out.println("Close browser in Safari");
    }
}

class IE extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in IE");
    }
    void loadWebsite(String website){
        System.out.println("load the website inside the browser using IE");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in IE");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in IE");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in IE");
    }
    void closeBrowser(){
        System.out.println("Close browser in IE");
    }
}