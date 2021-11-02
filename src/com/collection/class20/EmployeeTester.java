package com.collection.class20;

import com.collection.class21.Employee;
import com.collection.class21.Person;

public class EmployeeTester {

    public static void main(String[] args) {
        EmployeeFromOtherP employee=new EmployeeFromOtherP();
        //employee.name; can't access because its private and we are not inside the same class
        //employee.age;  can't access because it has default access modifier
        //employee.height; can't access because no extends keyword
        employee.weight=50;
        employee.sleep();
        //employee.eat(); can't access no extends keyword
        Person.run();
        EmployeeFromOtherP.run();
        //Person.takeLeaves(); inheritance is one way we can not do that
        employee.empId="123";
        EmployeeFromOtherP.takeLeaves();
    }
}
