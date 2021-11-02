package com.collection.class27.task;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following
    unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that
    implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {

        System.out.println("Maximize the Google chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Google Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close FireFox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox window");
    }

    @Override
    public void findElement() {

        System.out.println("Find elements in Firefox");
    }
}
