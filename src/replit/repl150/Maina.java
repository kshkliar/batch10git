package replit.repl150;
/*1. Create four classes (Person, Employee, Student, Retiree)
* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
**Expected Output:**
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour*/

class Persona {
    String name;
    String lastName;
    int age;
    Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

class Employeea extends Persona {
    int salary;
    public Employeea(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public Employeea(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    void print() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class Maina {
    public static void main(String[] args) {
        Employeea emp = new Employeea("Joe", "Smith", 35, 35000);
        emp.print();
        Studentu st = new Studentu("Adam", "Smith", 15, 10);
        st.print();
        Retireea ret = new Retireea("Frank", "Smith", 15, "tour");
        ret.print();
    }
}
