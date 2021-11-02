package com.collection.class27.interfacedemo;

public  interface Trustable {
    void trust();
}
interface Bank extends Trustable{
    void hasChecking();
    void hasSaving();
    default void hasCreditCard(){
        System.out.println("Almost all of the banks have credit cards");
    }
    static void depositMoney(){
        System.out.println("You can deposit in your bank");
    }
}
class FinancialInstitution {
    public void financing(){
        System.out.println("All the financial institutes deal with financial transaction");
    }

}
class BOA extends FinancialInstitution implements Bank{

    @Override
    public void trust() {
        System.out.println("You can trust BOA for your money");
    }

    @Override
    public void hasChecking() {
        System.out.println("BOA has 3 checking accounts");
    }

    @Override
    public void hasSaving() {
        System.out.println("BOA has 2 saving accounts");
    }
}
