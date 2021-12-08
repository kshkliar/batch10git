package com.collection.class27.encapsulationdemo1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setName("askdfbks4548935");
        bankAccount.setPassword("123456");//установили пароль
        System.out.println(  bankAccount.getBalance("sdskd"));// предоставили пароль что бы получить баланс который не совпал

    }
}
