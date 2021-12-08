package com.collection.class26.abstractiondemoa;

public abstract class Phone {

    private String make;
    String model;

    public void makePhoneCall() {
        System.out.println("Calling");
    }

    public void sendSMS() {
        System.out.println("Sending a message");
    }

    protected abstract void takePictures();

    protected abstract void unlock();

}

class Iphone extends Phone implements CallAble {

    public void takePictures() {
        System.out.println("Take pictures with 12 Mega pixel" + "camera");
    }


    @Override
    public void method() {
        System.out.println("this device can make phone calls");
    }

    @Override
    protected void unlock() {
        System.out.println("Unloak with face id");
    }
}

class Samsung extends Phone {
    public void takePictures() {
        System.out.println("Take picture with 108 Megapixels " + "camera");
    }

    public void unlock() {
        System.out.println("unlock with fingerprint");
    }
}
