package com.collection.class29.wrapperclasses;

public class WrapperClassesa {
    public static void main(String[] args) {
        String name = "Hello";
        String name2 = new String("Hello");
        Integer number = new Integer(10);
        String strNumber = number.toString();
        System.out.println(strNumber);

        Integer number2 = 20;
        Double doubleNumber = 35.0;
        int number3 = Integer.parseInt("1000");
        Integer number4 = Integer.parseInt("1000");
        System.out.println();
        int number6 = number.intValue();
        int number7 = number;

    }
}
