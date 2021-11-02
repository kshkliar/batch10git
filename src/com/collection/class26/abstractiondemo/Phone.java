package com.collection.class26.abstractiondemo;

public  abstract class Phone {
    private String make;
    String model;
    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending a message");
    }
    protected abstract void takePictures();
    public abstract void unlock();
}
class Iphone extends Phone implements CallAble{

    public void takePictures() {
        System.out.println("Take pictures with 12 Mega pixel camera");
    }
    public void unlock(){
        System.out.println("unlocks with face id");
    }

    @Override
    public void method() {
        System.out.println("this device can make phone calls");
    }
}

class Samsung extends Phone{
public void takePictures(){
        System.out.println("Take pictures with 108 Megapixels camera");
    }
    public void unlock(){
        System.out.println("unlock with fingerprint");
    }
}