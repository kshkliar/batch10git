package Repl178;

class Main {
    public static void main(String[] args){
        EncapsulationDemo encapsulation=new EncapsulationDemo("John",30);
        System.out.print("Employee Name: "+encapsulation.get_EmpName()+"\n");
        System.out.print("Employee Age: "+encapsulation.get_EmpAge());
    }
}