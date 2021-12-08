package com.collection.class24.overridingdemo1a;

public class Tester {
    public static void main(String[] args) {
        StateBanka stateBanka = new StateBanka(1500);
        stateBanka.chargeFee();
        System.out.println(stateBanka.fee);
        BOAa boa = new BOAa(1500);
        boa.chargeFee();
        System.out.println(boa.fee);
        Chasea chase = new Chasea(1500);
        chase.chargeFee();
        System.out.println(chase.fee);
    }
}
