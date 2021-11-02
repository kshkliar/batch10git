package replit;

/*
Create a class 'Main' (please don not make it public as Repl give you an error)
Inside class declare a String variable 'name' and intiger variable 'roll no'.
Create an object of the class and assign the value of 2 to roll_no and value of "John"
to name
Your program should print the following:
Name is John and roll number is 2
 */


public class Task086a {// вот Class
String name;
int roll_in;

    public static void main(String[] args) {
        Task086 student=new Task086();
        student.name="John";
        student.roll_no=2;
        System.out.println("Name is "+student.name+"roll number is "+student.roll_no);
    }
    }

