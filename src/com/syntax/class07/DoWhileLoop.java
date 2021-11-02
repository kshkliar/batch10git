package com.syntax.class07;

public class DoWhileLoop {

    public static void main(String[] args) {

        System.out.println(" ----  while ----  ");

        int i = 1;

        while (i >= 3) {
            System.out.println("Hello");
            i++;
        }

        System.out.println(" ----  do while ----  ");

        int j = 1;

        do {
            System.out.println("Hello");
            j++;
        } while (j >= 3);

        System.out.println("    ----------------------------------------   ");

        // print numbers from 1 till 10 using do while loop

        int n = 1;

        do {
            System.out.println(n);
            n++;
        } while (n <= 10);


        for (int j1 = 1; j1 <= 10; j1++) {

            System.out.println(j1);
        }
        System.out.println("fuhgfdbgfdbgjfdbhj");
        int d = 11;

        while (d <= 10) {
            System.out.println(d);
            d++;
        }


        int d1 = 11;

        do {
            System.out.println(d1);
            d1++;
        }
        while (d1 <= 10);

    }
}
