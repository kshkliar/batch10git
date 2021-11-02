package com.syntax.class03;

public class IfWithNoBraces1 {

    public static void main(String[] args) {

        System.out.println("Code starts....");

        double temp=-3;

        if (temp<0)
            System.out.println("Water will freeze with temperature"+ temp);
        else
            System.out.println("Water will not freeze with temperature"+ temp);
        System.out.println("Because it is cold outside");

        /* when if statement is used without {}
         * then java allows only 1 statement for each block
         * meaning 1 line for if block and 1 line for else block ONLY
         */
    }
}
