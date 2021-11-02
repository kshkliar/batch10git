package Repl182;

class Person {
    private String firstname;
    private String lastname;
    private String ssn;
    private int birthday;
    private int birthmonth;
    private int birthyear;

    Person(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
    }

    public String Get_FirstName() {
        return this.firstname;
    }

    public String Get_LastName() {
        return this.lastname;
    }

    public String Get_Ssn() {
        return this.ssn;
    }

    public int Get_BirthDay() {
        return this.birthday;
    }

    public int Get_BirthMonth() {
        return this.birthmonth;
    }

    public int Get_BirthYear() {
        return this.birthyear;
    }

    public String FormatBirthday() {
        return Get_BirthMonth() + "/" + Get_BirthDay() + "/" + Get_BirthYear();
    }


}