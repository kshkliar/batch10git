package com.caveOfProgramming;

class Frog{
    private int id;
    private String name;

    public Frog (int id, String name){
        this.id=id;
        this.name=name;

    }

    public String toString(){
        return id+ ":";

    }
}


public class ThetoStringMethod {

    public static void main (String [] args) {
        Frog frog1= new Frog(7, "Freddy");
        Frog frog2 = new Frog (5, "Roger");
        System.out.println(frog1);
        System.out.println(frog2);
    }

}
