package replit.Repl180;
/*Create Class EncapsulationDemo
create two variable as shown below.
private String empName=John;
private int empAge=30;
Create only getters methods for each variable.
Print the values of each variable as shown below.
**Expected Output:**
Employee Name: John
Employee Age: 30
```*/
class EncapsulationDemo{
    private String empName="John";
    private int empAge=30;



    public String get_EmpName(){
        return this.empName;
    }
    public int get_EmpAge(){
        return this.empAge;
    }

}
class Main {
    public static void main(String[] args){
        EncapsulationDemo encapsulation=new EncapsulationDemo();
        System.out.println("Employee Name: "+encapsulation.get_EmpName());
        System.out.print("Employee Age: "+encapsulation.get_EmpAge());
    }
}