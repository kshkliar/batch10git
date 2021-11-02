package com.collection.class16;


import com.collection.class17.AccessModifierDemo1;

public class AccessModifierDemo1Tester extends AccessModifierDemo1 {

    void methodInASeparateClass(){
        //System.out.println(name);
        //System.out.println(age);
        System.out.println(city);
        System.out.println(height);
        method4();
    }

    public static void main(String[] args) {

        AccessModifierDemo1 accessModifierDemo1=new AccessModifierDemo1();
        //System.out.println(accessModifierDemo1.name);
        /*
        can not access because default works in same
        package only
         */
        //accessModifierDemo1.method2();
        accessModifierDemo1.method3();
       // accessModifierDemo1.method4();


    }
}
