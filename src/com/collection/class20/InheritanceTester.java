package com.collection.class20;

public class InheritanceTester {
    public static void main(String[] args) {
     Developer developer=new Developer();
     developer.eat();
     developer.developApplications();
     Tester tester=new Tester();
     tester.name="Blake";
     tester.eat();
     tester.testCode();
    }
}
