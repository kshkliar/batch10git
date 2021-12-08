package andreyJava.homeworks.hw14;
/*Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
and  five overloaded methods that set this fields with different arguments list.
Create class that will be use instance of class Person and his methods.*/

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public Person(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    Person() {

    }
//аргумент лист это входящие параметры- колл входящих параметров
    public String displaySomeInfo(String firstName, String lastName, int age, String gender, int phoneNumber) {
        age = 25;
        gender = "F";
        phoneNumber = 3434545;
        return firstName = "Ann".concat(lastName = "Popova") + " " + age + "" + gender + " " + phoneNumber;
    }

    public static String displaySomeInfo(String firstName, String lastName, int age, String gender) {
        firstName = "Ostap";
        //    lastName "Bender";
        age = 24;
        gender = "M";
        int phoneNumber = 23223232;
        return firstName.concat(lastName) + " " + age + "" + gender;
    }

    public static String displaySomeInfo(String firstName, String lastName, int age) {
        return firstName.concat(lastName) + " " + age;
    }

    public static String displaySomeInfo(String firstName, String lastName) {
        return firstName.concat(lastName);
    }

    public static String displaySomeInfo(String firstName) {
       return firstName;
    }
}
