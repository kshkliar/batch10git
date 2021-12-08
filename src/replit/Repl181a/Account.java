package replit.Repl181a;

/*# Encapsulation
Create Class Account
Create the below variables:
- acc_no;
- name;
- email;
- double amount;
Create the getter/setter methods for each variable.
In Main Class and the main method.
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com
amount = 50000.0
Using getter methods print the values as below output.
**Expected Output:**
7560504000 Sumair sumair@syntax.com 50000.0*/
class Account {
    String acc_no;
    String name;
    String email;
    double amount;

   public Account(String acc_no, String name, String email, double amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}