package com.collection.class18;

public class Task1a {
// Create a method that will accept an array as parameters
// and will return a sum of all elements from that array.
// Method should be visibly only within same package and
// accessible by the creating an instance of the class.
    double sumArray(double [] array){
        double sum=0;
        for (double element:array
             ) {
            sum+=element;
        }
        return sum;
    }

}
