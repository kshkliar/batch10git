package andreyJava.homeworks.hw05;

import andreyJava.lessons.learn_enum.Country;

/*Создать класс Man c полями имя, пол, фамилия, возраст, должность.

//сравниваем должности но дожность это уже отдельный класс( как в предыдущем задании)
 Для должности создать отдельный класс с полем название должности.   //отдельный java файл или класс в это классе?
        Создать несколько людей с одинаковой и разными должностями.
        Создать методы позволяющие:
        - вывести данные о человеке.
        - проверять должности на одинаковость у двух людей.
        - проверять однофамильцев у двух людей.
*/
public class Man {

    private String name;
    private String gender;
    private String surName;
    private int age;
    private Position position;
    private Country country;

    public Man(String name, String gender, String surname, int age, Position position) {
        this.name = name;
        this.gender = gender;
        this.surName = surname;
        this.age = age;
        this.position = position;
    }

    public Man(String name, String gender, String surName, int age, Position position, Country country) {
        this.name = name;
        this.gender = gender;
        this.surName = surName;
        this.age = age;
        this.position = position;
        this.country = country;
    }

    public Man() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getsurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public void displayInfo() {
        System.out.println("Name is " + name + " " + surName + " gender is " + age + " position is " + position);
    }


    //остался вопрос как создать объект/который  который будет вызывать методы и сравнивать эти объекты
// и их параметры выводить результат


    }

/*String name;
int age;
//Constaractor

public Student(String name, int age){
    this name=name;
        int age=age;
        }


//getter
  public String getName(){
    return name;
        }
  public void setName(String name){
    this.name=name
        }



*/