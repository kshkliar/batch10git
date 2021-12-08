package replit.Repl182a;

/*# Encapsulation
Create a Person class with the following:
**Class Variables**
- firstname
- lastname
- birthmonth
- birthday
- birthyear
- String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective
 private class variables
**Methods**
Create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String
composed of their birthday in
 mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000,
 it should return the String "3/22/2000"**
in Main Class.
Instantiate and object of Person and provide values.
 follows below outputs for values.
using getter and method print them separately.
**Note: Read carefully the steps.**
**Expected Output:**
John
Doe
10/25/1900
123-45-6789*/
class Person {
    private String firstname;
    private String lastname;
    private String ssn;
    private int birthmonth;
    private int birthsday;
    private int birthyear;

    public Person(String firstname, String lastname, String ssn, int birthmonth, int birthsday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthsday = birthsday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthsday() {
        return birthsday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String formatBirthday() {
        return getBirthmonth() + "/" + getBirthsday() + "" + getBirthyear();
    }
}

