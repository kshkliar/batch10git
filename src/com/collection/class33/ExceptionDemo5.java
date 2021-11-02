package com.collection.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

public class ExceptionDemo5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("1 ");
    //  System.out.println(10/0);
        try{
            method();
        }
        catch (ArithmeticException e){
            System.out.print("7 ");
            //System.out.println("Not Possible in math");
        }catch (NegativeArraySizeException e){
            System.out.print("8 ");
           // System.out.println("Please give positive size");
        }catch (NullPointerException e){
            System.out.println("Please don't put null");
            System.out.print("9 ");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.print("10 ");
        }
        System.out.print("11 ");
    }

    public  static void method(){
        System.out.print("2 ");

        // System.out.println(10/0);
        System.out.print("3 ");
        String name=null;
        try{
            FileInputStream fileInputStream=new FileInputStream("kjsbfskdffb");
        }catch (Exception e){
            System.out.println("A ");
        }

        System.out.print("4 ");
        name.length();
        System.out.print("5 ");
        int arr[]=new int[-10];
        System.out.print("6 ");
    }
}
