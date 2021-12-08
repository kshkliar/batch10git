package com.collection.class25.task2a;

public class Tester {
    public static void main(String[] args) {
        /*CreditCard creditCard=new CreditCard(1000);
        creditCard.calculateInterest();
        Visa visa=new Visa(1000);
        visa.calculateInterest();
        AX ax=new AX(1000);
        ax.calculateInterest();
        // Break till 11:31*/
        CreditCard creditCard1=new AX(120);
        creditCard1.calculateInterest();
        //creditCard1.myownMwethod();
        //not allowed

      //  AX ax=(AX)new CreditCard(120);
        //Run time error not possible with non-primitive
        AX ax2=(AX)creditCard1;//метод обьекта будет вызываться мы обьект сохранили в больший кдасс
        //положили или оборнули свой обект в другой класс
    }
}
