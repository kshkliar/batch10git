package com.collection.class18;

public class DogTestera {
    public static void main(String[] args) {

        Doga dog4 = new Doga();
        dog4.printDogInfo();

        Dog dog2=new Dog("Body");
        dog2.printDogInfo();

        Dog dog3=new Dog("Jimmi",20);

        dog3.printDogInfo();

        Doga dog1=new Doga("Tommy",10,12.5,25,"BullDog","White");
        dog1.printDogInfo();
    }
}
