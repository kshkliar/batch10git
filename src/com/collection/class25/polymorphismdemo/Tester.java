package com.collection.class25.polymorphismdemo;

public class Tester {
    public static void main(String[] args) {

    WebDriver[] drivers={new WebDriver(),new GoogleChrome(), new FireFox(),new IE(),new Safari()};
        for (WebDriver driver:drivers
             ) {
            testOnAllBrowsers(driver);
        }
    }
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
