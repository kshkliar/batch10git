package com.collection.class19;


import java.util.Scanner;

public class PersonTestera {
    public static void main(String[] args) {

        Persona person1 = new Persona("Jamil", 30);
        person1.printInfo();


        Scanner scanner=new Scanner(System.in);
        Persona person2=new Persona(scanner.next());
        person2.printInfo();
        //Break till 11:40

    }
}
