package com.collection.class32.excelFile;

public class Person {
    //Which data structure is perfect for storing exel files? For example from our example file
    // 2 d array is limited  , this first method is to create separate class to hold data from exel
    //  The best is array list see Reading Storing exel
//for each header we create separate field
    String firstName;
    String lastName;
    String age;
// creating constructor
    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
// If we want to see the actual data instead of adress we need to override this toString() methods
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
