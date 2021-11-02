package com.collection.class25.catingdemo;

public class Tester {
    public static void main(String[] args) {

        Father container=new Son("Abdul");
        container.eat();
        container.sleep();
        container.eat();
        container.sleep();
        container.eat();
        container.sleep();
        container.eat();
        container.sleep();
        container.eat();
        container.sleep();

        ((Son)container).playGamesOnComputer();
        container=new Fawad("Fawad");
        container.eat();
        container.sleep();
        ((Son)container).playGamesOnComputer();
//Break till 1:15

        Object[] object={"ksdfjks",1215,'A',false};



    }
}
