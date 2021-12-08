package com.collection.class26.castinga;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Dog();

Animal animal1=new Dog();//  дог сейчас находи тся в анимал и вызываються методы которые в анимал.
        if (animal instanceof Cat) {//если это экзэмпляр кота то

        }//тогда делаем кастинг
      Cat cat=(Cat)animal;  //это конвертируем анимал в кота, олько потом он сможет вызвать метод кота.
        ((Cat)animal).meow();

    }
}
