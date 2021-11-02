package replit.repl137;
/*For you to do
In main class please declared the variables using different access modifiers that
will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**

My name is John and I live in Miami. I study at Syntax in batch 9*/
class Maina {

private String name;
protected String city;
String nameOfSchool;
public String batchNumber;

    Maina(String name, String city, String nameOfSchool, String batchNumber) {
        this.name=name;
        this.city=city;
        this.nameOfSchool=nameOfSchool;
        this.batchNumber=batchNumber;
    }

    void display() {
        System.out.println("My name is "+name+ " and i live in "+city+ " I study at "+nameOfSchool+
                        " in batch "+batchNumber);

    }

    public static void main(String[] args) {
        Maina student=new Maina("John","Miami","Syntax","9");
  student.display();
    }

}

