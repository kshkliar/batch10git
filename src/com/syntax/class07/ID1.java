package com.syntax.class07;

class ID1 {
    public static void main(String[] args) {
        int count = 1;


        int result = ++count + ++count + count++ - +count;//2+3+3-3

        System.out.println(result);

        System.out.println("-----Increment Decrement");

        int i = 10;

        i = i + 1;
        i += 1;//i+1

        System.out.println(i);//12
        i++;// i+1
        System.out.println(i);//13

        int a=10;
        a-=1;
        a--;//a-1
        System.out.println(a);//8
    }
}
