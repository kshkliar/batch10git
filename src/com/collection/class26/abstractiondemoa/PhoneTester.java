package com.collection.class26.abstractiondemoa;

public class PhoneTester {
    public static void main(String[] args) {
        // Phone phone=new Phone(); CE Not possible to create object directly

        Phone phone = new Samsung();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();
        // break till 1:55


    }
}
