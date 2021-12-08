package replit.Repl178;
/*# Encapsulation
Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:**
Employee Name: John
Employee Age: 30*/
class EncapsulationDemo{
    private String empName;
    private int empAge;

    EncapsulationDemo(String empName,int empAge){
        Set_EmpName(empName);//помеслили сюда сеттеры и сюда будут заходить
        Set_EmpAge(empAge);//в этот метод внутри конструктора будут заходить аргументы
    }
    public void Set_EmpName(String empName){
        if(empName.length()>1){
            this.empName=empName;
        }else{
            System.out.println("Name must be provided");
        }
    }
    public void Set_EmpAge(int empAge){
        if(empAge>18){
            this.empAge=empAge;
        }else{
            System.out.println("Employee must be at least 18");
        }
    }
    public String get_EmpName(){
        return this.empName;
    }
    public int get_EmpAge(){
        return this.empAge;
    }

}