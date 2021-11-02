package com.collection.class25.overridingdemo1;

public class Tester {


    public static void main(String[] args) {
        Employee employee=new Employee("Abdul");
        employee.performDailyActivities();
        Student student=new Student("Sharif");
        student.performDailyActivities();
        Teacher teacher=new Teacher("Asghar");
        teacher.performDailyActivities();
    }
}
