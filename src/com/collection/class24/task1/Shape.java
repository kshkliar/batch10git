package com.collection.class24.task1;

public class Shape {
    /*
Write program: Shape class has a constructor that takes the
radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle.
 Test your code.

 */
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.area();
    }
}
