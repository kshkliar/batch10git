package com.alishev.arrays;

public class Class13arrayTwo4mentional {
    public static void main(String[] args) {


    /*
    *1, 2, 3, 4, 5, 6
    156
    * 145 -что бы обратиться к элементу нужно указат ь2 индекса.ряд и столбец
    * 268

     */

        int[] number = {1, 2, 3};
        int[][] matrice = {{1, 2, 3, 4, 5}, // сторока 0  //каждый элемент 4 д4умерном маси4е я4ляется одномерным масси4ом
                           {4, 5 },// строка 1
                           {7, 8, 9}};// строка 2
        System.out.println(matrice[0][4]); //- обращаемся к строке под индексом 1 пер4ый элемент от4ечает за строки, 4торой за столбцы
        // на пересечении этих индексо4 лежит значение -"5"(находиться 4 0-4ой строке под индексом 4
        System.out.println(matrice[2][1]);
        System.out.println(matrice[2][2]);//9  -0,1,2- 2-я строка от 0 , 2-й индекс от 0 -9
        System.out.println(matrice[1][1]); // 2-я торая строка , 2-е число
        // 2 мерный масси4 это таблица
        //каждый элемент д4умерного масси4а это одномерный масси4
        System.out.println("-----------");



    }

}