package com.collection.class20;

public class InheritanceTestera {
    public static void main(String[] args) {
        Developera developer = new Developera();
        developer.eat();
        developer.developApplications();
        Tester tester = new Tester();
        tester.name = "Blake";
        tester.eat();
        tester.testCode();
    }
}