package com.collection.class19;


import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {


        Person person1=new Person("Jamil",30);
        person1.printInfo();

        Scanner scanner=new Scanner(System.in);
        Person person2=new Person(scanner.nextInt(), scanner.next());
        person2.printInfo();

        //Break till 11:40

    }
}
