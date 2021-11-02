package replit;

/* Declare 3 instance variables to hold
name of the country
capital
population size
Create a method to display values of instance variables;
Create 2 objects , assign valus to instance variables, execute method display;
Expected output:
The capital of USA is Washington DC and population is 3300000;
The capital of Kazahstan is Astana and population is 1850000;
 */
public class Task122a {

    String country;
    String capital;
    long population;

  public static void main(String[] args) {
    Task122a m=new Task122a();  //имя класса , название обьекта(переменная) ,new+конструктор;
    m.country="USA";
    m.capital="Washington DC ";
    m.population=3300000;
    System.out.println("The capital of " +m.country+ " is "+ m.capital+" and population is "+ m.population);
    Task122a x=new Task122a();//обьект-экземпляр класса;
    x.country="Kazahstan";
    x.capital="Astana";
    x.population=18500000;
    System.out.println("The capital of " +x.country+ " is "+ x.capital+" and population is "+ x.population);



  }


}
