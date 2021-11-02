package com.syntax.class07;

public class DoWhileLoop1 {

    public static void main(String[] args) {


        System.out.println("-----While-------");

        int i = 1;
        while (i >= 5) {
            System.out.println("Hello");
            i++;

        }

        System.out.println("-----Do while------");

        int j = 1;

        do {

            System.out.println("Hello");
            j++;
        } while (j >= 3);
        System.out.println("------------------------------------------");
        //Print numbers from 1 till 10 using do while loop


        int n = 1;

        do {
            System.out.print(" "+n);
            n++;
        } while (n < 10);

        System.out.println("\n------For loop------");
        for (int j1=1;j1<=12; j1++){

            System.out.print(" "+ j1);
        }

        int d=11;
        while(d<=10){
            System.out.println(" "+ d);
            d++;
        }
        System.out.println("\n----Another do while");
int d1=11;
do {
    System.out.println(d1);
    d1++;
}
while(d1<=10);
    }

}
