package com.collection.class27.interfacedemo;

public class Tester {
    public static void main(String[] args) {
        Trustable trustable=new BOA();
        trustable.trust();
        Bank bank=new BOA();
        bank.trust();
        bank.hasChecking();
        bank.hasSaving();
        bank.hasCreditCard();

        Bank.depositMoney();

        BOA boa=new BOA();
        boa.trust();
        boa.hasChecking();
        boa.hasSaving();
        boa.hasCreditCard();
        boa.financing();





    }
}
