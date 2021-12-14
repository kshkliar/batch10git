package com.collection.class33;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        try{// try this code
            System.out.println(10/0);// if exeption - execute , if we do not get eror not execute next line of code( 10/0)
        }catch (Exception mike){// mike is just name of variable.// if enything gets wrong print following
            System.out.println("This is not possible in java");
        }//class // internally it is written if else condition if path name is null  - create an object of Nullpointer class
// and continue execute rest of code
        // tthis will be throw  -to somebody ho writenn this peace of code ( that has null )
        // that is why we write catch to catch what was thrown
        // is path is = 0 condition will be true - and object of exeption will be created and thrown
        //Break till 12:55
        // class NullpointerException extends
        System.out.println("Line 1 after error");
        System.out.println("Line 2 after error");
        System.out.println("Line 3 after error");
        System.out.println("Line 4 after error");
        System.out.println("Line 5 after error");
// How to read exeption - always start from last line
        //first part is nothing but just name of packege;
        //показывает путь где находиться ошибка
        //потом снизу вверх обьясняет что вызвало ошибку - снизу вверх
        //If you see FileInputStream  put on File курсором что бы открыть документацию и увидеть од=шибку (
        //например что он указывает на 0
    }
}
