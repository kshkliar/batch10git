package com.collection.class28;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sule");
        person.setAge(16);
        person.setSSN("123456789");//если здесь указать меньший ssn выдаст ошибку- null pinter exeption
        System.out.println(person.getName());
        System.out.println(person.getAge("123456789"));
        //* Person person1 = null; вы не можем вызывать метод переменной со значением null ( никаким)
      //  person1.setAge(12);*|| если переменная обтьекта никуда не указывает то она не может вызывать никакой метод
    }
}
