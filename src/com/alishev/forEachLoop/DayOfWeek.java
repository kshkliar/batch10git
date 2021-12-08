package com.alishev.forEachLoop;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek =
                {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};


        for (String dayOfWeek : daysOfWeek) //для каждогого dayOfWeek(елемента-которого мы назвали переменной)
            //  из (массива) daysOfWeek сделать:
        {
            System.out.println(dayOfWeek);//напечатать каждый элемент из масссива dayOfWeek
        }
    }
}

