package com.collection.class27.encapsulation;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       person.setName("Burju");
       person.setAge(25);
       person.setWeight(80);
        /* person.name="Burju";
        person.age=16;
        person.weight=30;
        person.height=5;*/
        person.printInfo();

        Person person1=new Person();
       /* person.name="Mick King";
        person.age=120;
        person.height=2000;
        person.weight=-15;*/
        //person.printInfo();
    }
}
