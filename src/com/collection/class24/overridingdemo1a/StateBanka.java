package com.collection.class24.overridingdemo1a;

public class StateBanka {

    double money;
    double fee;

    StateBanka(double money) {
        this.money = money;
    }

    public void chargeFee() {
        if (money < 1000) {
            fee = money * 0.01;
        } else {
            fee = money * 0.02;
        }
    }
}
class BOAa extends StateBanka{
    BOAa (double money){super(money);}

    public void chargeFee() {
        if (money < 500) {
            fee = money * 0.02;
        } else {
            fee = 0;

        }
    }
}
class Chasea extends StateBanka {
    Chasea(double money){super((money));}

    public void chargeFee() {
        fee=0;
    }
}