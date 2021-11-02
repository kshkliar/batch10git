package replit;
/*Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
___located on____continent
In the main method assign values to a static variable and execute method display
Expecte output:
Morocco located on Africa continent
 */




public class Task129 {
    static String countryName;
    static String continent;

    void display(){
        System.out.println(countryName+ " located on " +continent + " continent");
    }
  public static void main (String[]args){
        countryName= "Morocco";
        continent = "Africa";

        Task129 m = new Task129();
        m.display();
  }


}
