package Repl182;

class Main
{
    public static void main(String[] args){
        Person person=new Person("John", "Doe", "123-45-6789", 10, 25, 1900);
        System.out.println(person.Get_FirstName());
        System.out.println(person.Get_LastName());
        System.out.println(person.FormatBirthday());
        System.out.println(person.Get_Ssn());

    }
}