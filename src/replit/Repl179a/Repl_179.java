package replit.Repl179a;

/*# Encapsulation
Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
Employee Name: Mario
Employee Age: 32*/
class EncapsulationDemoa {
    String empName;
    int empAge;

    EncapsulationDemoa() {

    }

    public void setEmpName(String emp) {
        if (emp.length() > 1) {
            this.empName = emp;
        } else {
            System.out.println("Name must be provided");
        }
    }

    public void SetAge(int empAge) {
        if (empAge > 18) {
            this.empAge = empAge;
        } else {
            System.out.println("employee must be at least 18");
        }
    }

    public String getEmpName() {
        return this.empName;

    }

    public int getEmpAge() {
        return this.empAge;
    }
}

class Main {
    public static void main(String[] args) {
        EncapsulationDemoa obj=new EncapsulationDemoa();
        obj.setEmpName("Mario");
        obj.SetAge(32);
        System.out.println("Employee name: "+obj.getEmpName()+"\n");
        System.out.println("Employee age: "+obj.getEmpAge());
    }
}