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
public class Task122 {
    String countryName;  //instance variable;
    String capital;
     long population;

    public static void main(String[] args) {
        Task122 m = new Task122();
        m.countryName= "USA";
        m.capital="Washington DC";
        m.population = 3300000;
        System.out.println("The capital of " + m.countryName+ " is "+ m.capital+ " and population is " + m.population);

         Task122 x = new Task122();
        x.countryName="Kazahstan";
        x.capital= "Astana";
        x.population= 1850000;
        System.out.println("The capital of" +x.countryName+ " is " + x.capital + " and population is " + x.population);
    }
}
