package com.collection.class24.overridingdemo;

public class Employeea {
  double salary;
  String name;

    public Employeea(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    void getPaid() {
        System.out.println(name+ " is getting paid "+salary+ "/anum");
    }
}

class Contractora extends Employeea{
    public Contractora(double salary, String name) {
        super(salary, name);
    }


    void getPaid() {
        System.out.println(name+ " is getting paid "+salary+ "/hourly");
    }
}

class FullTimeEmployeea extends Employeea{
    public FullTimeEmployeea(double salary, String name) {
        super(salary, name);//нельзя аргументы менять местами
    }

    public static void main(String[] args) {
       FullTimeEmployeea fullTimeEmployeea= new FullTimeEmployeea(100000,
               "Dilnoza");
       fullTimeEmployeea.getPaid();
        Contractora contractora=new Contractora(45,"Jesus");
        contractora.getPaid();
    }
}
