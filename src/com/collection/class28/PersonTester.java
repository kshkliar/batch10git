package com.collection.class28;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sule");
        person.setAge(16);
        person.setSSN("123456789");
        System.out.println(person.getName());
        System.out.println(person.getAge("123456789"));
       /* Person person1 = null;
        person1.setAge(12);*/
    }
}
