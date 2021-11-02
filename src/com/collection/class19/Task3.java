package com.collection.class19;

public class Task3 {

    private Task3(){//first constructor

    }
     Task3(String name){

    }
    protected Task3(int age){//second with parameters

    }
    public  Task3(boolean isRaining){//third with parameters

    }

    public static void main(String[] args) {
        Task3 task1=new Task3();
        Task3 task2=new Task3("blabla");
        Task3 task3=new Task3(15);
        Task3 task4=new Task3(false);
    }
}
