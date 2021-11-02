package com.collection.class21;

public class Developer extends Employee{
    String programmingLanguage;
    void code(){
        System.out.println("Developer having Id "+empId+" age "+age+" can program in "+programmingLanguage);
    }

    public static void main(String[] args) {

        Developer developer=new Developer();
        developer.empId="123";
        developer.age=50;
        developer.programmingLanguage="Java";
        developer.code();
        developer.work();
        developer.sleep();

    }
}
