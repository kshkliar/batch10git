package com.collection.class25.polymorphismdemo;

public class Tester {
    public static void main(String[] args) {
//создан массив тиа веб драйвер куда помещены все браузеры в форме обьектов и их методы
    WebDriver[] drivers={new WebDriver(),new GoogleChrome(), new FireFox(),new IE(),new Safari()};
        for (WebDriver driver:drivers
             ) {
            testOnAllBrowsers(driver);
        }
    }//сюда по очереди подставляються все обьекты аррая:   webdriver -переменная в которую будут подаваться
    // обьекты а они будут использовать методы родительского клаасса эт ои есть полиморфм=изм
    static void testOnAllBrowsers(WebDriver webDriver){
        webDriver.openBrowser();
        webDriver.loadWebsite("ww.yahoo.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();


       /* WebDriver webDriver=new GoogleChrome();
        webDriver.closeBrowser();*/

    }
}
