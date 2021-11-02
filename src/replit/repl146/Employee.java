package repl146;

class Employee{
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee(){
        name=null;
        lastName=null;
        employeeId=0;
        startDate=null;
        salary=0;
    }
    Employee(String name,String lastName,int employeeId,String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    void Display(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}