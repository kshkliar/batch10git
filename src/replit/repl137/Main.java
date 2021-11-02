package replit.repl137;

class Main {
    private String name;
    protected String city;
    String nameOfTheSchool;
    public String batchNumber;

    Main(String name, String city, String nameOfTheSchool, String batchNumber) {
        this.name = name;
        this.city = city;
        this.nameOfTheSchool = nameOfTheSchool;
        this.batchNumber = batchNumber;
    }

    void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfTheSchool + " in " + batchNumber);
    }

    public static void main(String[] args) {
        Main obj1 = new Main("John", "Miami", "Syntax", "batch 9");
        obj1.display();
    }
}

