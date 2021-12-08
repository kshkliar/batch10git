package com.collection.class26.abstractiondemo;

public abstract class Phone {
    private String make;
    String model;

    public void makePhoneCall() {
        System.out.println("Calling");
    }

    public void sendSMS() {
        System.out.println("Sending a message");
    }

    protected abstract void takePictures();//the feature that you do not want
    // to build(Функциональность которую ты не хочешь пока созавать
    //тот кто унаследует этот класс тот создаст

    public abstract void unlock();//когда ты делегируешь написание кода,
    // кто то просто наследует твой класс и строит его бизнес логику
    //а потом он просто просит название класа или обьекта который тот
    // написал имплементировал и унаследовал и потом интегрирует код
}
class Iphone extends Phone implements CallAble {//наследует пхоне но имплементирует
    // саллаблк
    public void takePictures() {
        System.out.println("Take pictures with 12 Mega pixel" +
                " camera");
    }
    public void unlock() {
        System.out.println("unlocks with face id");
    }

    @Override
    public void method() {
        System.out.println("this device can make phone calls");
    }
}

class Samsung extends Phone {
    public void takePictures() {
        System.out.println("Take pictures with 108 Megapixels " +
                "camera");
    }
    public void unlock() {
        System.out.println("unlock with fingerprint");
    }
}