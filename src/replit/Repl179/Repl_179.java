package replit.Repl179;
/*# Encapsulation
Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
Employee Name: Mario
Employee Age: 32*/
class EncapsulationDemo{
    String empName;
    int empAge;
    EncapsulationDemo(){
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
    public String Get_EmpName(){
        return this.empName;
    }
    public int Get_EmpAge(){
        return this.empAge;
    }

}
class Main {
    public static void main(String[] args){
        EncapsulationDemo encapsulation=new EncapsulationDemo();
        encapsulation.Set_EmpName("Mario");
        encapsulation.Set_EmpAge(32);
        System.out.print("Employee Name: "+encapsulation.Get_EmpName()+"\n");
        System.out.print("Employee Age: "+encapsulation.Get_EmpAge());
    }
}