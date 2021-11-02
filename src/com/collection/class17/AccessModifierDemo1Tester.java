package com.collection.class17;

public class AccessModifierDemo1Tester {
    public static void main(String[] args) {
        AccessModifierDemo1 accessModifierDemo1=
                new AccessModifierDemo1();

       // System.out.println(accessModifierDemo1.name);
        // can not access because field is private
        System.out.println(accessModifierDemo1.age);
        // can access because it is not private and has default
        //access which means we can access it inside same package
         // as well

        //accessModifierDemo1.method1();
        // error because method one is private
        accessModifierDemo1.method4();
        System.out.println(accessModifierDemo1.city);
    }
}
