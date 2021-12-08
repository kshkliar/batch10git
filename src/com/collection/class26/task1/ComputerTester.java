package com.collection.class26.task1;

public class ComputerTester {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Dell dell = new Dell();
        Computer[] computers = {apple, dell, new HP(), new Lenovo()};//два метода ( dell, new HP(),,
        // создания обьекта или вкладываем переменную
        for (int i = 0; i < computers.length; i++) {
            computers[i].browseInternet();//вызываем методы
            computers[i].openFiles();//вызываем методы
        }

        for (Computer computer : computers) {
            computer.browseInternet();//тоже самое адхенс фо лупом
            computer.openFiles();
        }

    }
}
