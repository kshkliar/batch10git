package com.collection.class25.task1;

public class Degree {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""
    To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class
    override method 'getPrerequisite'.
     */
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends  Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need a Bachelors degree first");
    }
}
