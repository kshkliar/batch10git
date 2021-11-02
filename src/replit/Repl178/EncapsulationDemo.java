package Repl178;

class EncapsulationDemo{
    private String empName;
    private int empAge;

    EncapsulationDemo(String empName,int empAge){
        Set_EmpName(empName);
        Set_EmpAge(empAge);
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