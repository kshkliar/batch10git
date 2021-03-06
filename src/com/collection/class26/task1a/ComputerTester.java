package com.collection.class26.task1a;

public class ComputerTester {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Dell dell = new Dell();
        Computer[] computers = {apple, dell, new HP()};

        for (int i = 0; i < computers.length; i++) {
            computers[i].browseInternet();
            computers[i].openFiles();
        }

        for (Computer computer : computers){
            computer.browseInternet();
            computer.openFiles();
        }

    }
}