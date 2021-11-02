package com.collection.class16;

public class SyntaxStudentTester {
    public static void main(String[] args) {
        SyntaxStudents student1=new SyntaxStudents();
        student1.name="Serge";
        student1.age=22;
        student1.id="123";

        student1.displayFee();
        SyntaxStudents.schoolName="Syntax techs";
        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2=new SyntaxStudents();
        student2.name="Elizebeth";
        student2.age=18;
        student2.id="2345";
        System.out.println(SyntaxStudents.schoolName);

    }
}
