package com.collection.class31;

import java.util.*;

public class recap {
    //we strore Object of ArrayList type into the variable of type List Unterface
    public static void main(String[] args) {

//now all the method of List is available but implementation of child class -ArrayList or LinkedList
        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Milk");
        System.out.println(grocery.size());


        List<String> grocery1 = new LinkedList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Cheese");
        System.out.println(grocery);
        //  Integer<String>integer=grocery.iterator();
        System.out.println(grocery1.size());
        //Set is another collection that do not allow duplicates
        // It has implementation of following Classes
//HashSet implements Set
        //we created the object of child class , we assigned it to parent
        Set<String> car = new HashSet<>();
        car.add("BWW");
        car.add("Kia");
        car.add("Honda");
        car.add("BWW");
        //How many elements inside the collection? -3
        System.out.println(car.size());
        System.out.println(car);
//we can just change right part - object when we want to manipulate the data
        //we change the object of child class and data struxrure - implementation is differante
        // this is what we will do in real work
        Set<String> car1 = new LinkedHashSet<>();//we can change to TreeSet
        car1.add("BWW");
        car1.add("Kia");
        car1.add("Honda");
        car1.add("BWW");
        //How many elements inside the collection? -3
        System.out.println(car.size());
        System.out.println(car);

        //How we can add object from on collection to another: it is easy:
        List<String> carCopy = new ArrayList<>(car);//(car) -It is a constructor
        System.out.println(carCopy);
        System.out.println(carCopy.get(0));

        //if we do not want to call a constructor
        //we want to add all elements from set collectiom
        List<String> carCopy2 = new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy2);

        //with methos addAll we can add intire collection inside another collection

        //To access 1-th element we can use iterator
        //we need to create an object of iterator
        Iterator<String>it=car.iterator();// method it gives / return the object of Iteretor type
      //  Integer<String>=it=car.iterator();// we store it to variable it
        //car.iterator()  -- return object
       String c= it.next(); // method next it moves to element and takes it
        // we store element to variable c
       String cc= car.iterator().next();// to method in line  we move from left to right
        // we are trimming our method ( подрезаем/обрезаем методы это так называеться
        //toLowercase  єто тоже стриминг
        String cc1= car.iterator().next(); //берем коллекцию вызываем метод iterator и затем вызываем метод next

       // Interview questions
        //How to remove duplicate elements from the list?
        //I can store it in another collection
        // you need to know the differance beetwen array and arrayLis
        //не смотря на то какую коллекцию используем можем вызвать iterator
        //You can always call method iterator it returns the object of type object
        //поэтому мы его так записываем :
      //  Iterator<Student> it = students.iterator(); он будет итерате по Струдент обжектам
    //hasNext  show us if we have next element ? only then we use method next(когда мы знаем что
        //следубщий елемент есть
        //when ever we go to next element we have to store it to veriable , exAMPLE
        //Student element=students.next(); -мы сохранили в переменную
    }
}