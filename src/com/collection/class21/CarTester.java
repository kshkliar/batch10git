package com.collection.class21;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car(" Tesla ","S",2020);
        car.printInfo();
        //one constructor calling another constaractor
        //perвым вызываеться конструктор который указан в конструкторе с одним параметром ( конструктор без параметров
        // потому что он находиться в другом конструкторе и так по цепочке.
    }
}
