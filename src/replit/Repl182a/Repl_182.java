package replit.Repl182a;

class Main{
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "123-45-6789",
                10, 25, 1900);
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());
    }
}