package replit.Repl178a;
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
class EncapsulationDemoa{

private String empName;
private int empAge;

    public EncapsulationDemoa(String empName, int empAge) {
        setEmpName(empName);
        setEmpAge(empAge);
    }

    public void setEmpName(String empName) {
        if (empName.length() > 1) {
            this.empName = empName;
        } else {
            System.out.println("Name must be provided");
        }
    }
    public void setEmpAge(int empAge){
            if (empAge > 18) {
                this.empAge = empAge;
            } else {
                System.out.println("Employee must be at least 18");
            }
        }
    public String getEmpName() {
        return this.empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}