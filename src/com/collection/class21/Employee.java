package com.collection.class21;

import com.collection.class20.Developer;

import javax.swing.*;

public class Employee extends Person {

   String empId;
   double salary;
   void work(){
       System.out.println("Employee "+empId+" having age " +
               ""+age+" is working");
   }
   void getPaid(){
       System.out.println(empId+" is paid "+salary);
   }
}
