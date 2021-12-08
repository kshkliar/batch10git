package replit.Repl180a;

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
class EncapsulationDemo {

    private String empName = "Konstantin";
    private int empAge = 36;


    public String getEmpName() {
        return this.empName;
    }

    public int getEmpAge() {
        return this.empAge;
    }
}

class Main {
    public static void main(String[] args) {
        EncapsulationDemo encapsulation = new EncapsulationDemo();
        System.out.println("Employee name " + encapsulation.getEmpName());
        System.out.println("Employee age " + encapsulation.getEmpAge());

    }
}