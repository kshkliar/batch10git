package Repl180;

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