package com.collection.class17;

public class StudentTester_a {
    public static void main(String[] args) {
   Student_a student =new Student_a();
   student.studentId="1";
   student.studentName="Michael";
   Student_a.numberOfStudents++;
   Student_a student1=new Student_a();
   student.studentName="Serge";
   student1.studentId="2";
   Student_a student2=new Student_a();
   student2.studentId="3";
   student2.studentId="Mars";
   Student.numberOfStudents++;
        System.out.println(Student.numberOfStudents);
    }
}
