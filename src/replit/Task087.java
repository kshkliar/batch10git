package replit;
//Create a class named 'Main' with specific attributes.
//Create two objects of that class in which you will be assigning the following values and then
//print them
public class Task087 {
        String carColor;
        int carYear;
        String carMake;

        public static void main(String[] args) {
                Task087 m=new Task087();
                Task087 x=new Task087();

                m.carColor="Black";
                m.carYear=2019;
                m.carMake= "BMW";

                x.carColor="White";
                x.carYear=2018;
                x.carMake="Toyota";

                System.out.println("Car color is " + m.carColor+ "and car year is "+m.carYear+ " and car model is " + m.carMake);
                System.out.println("Car color is " + x.carColor+ "and car year is "+x.carYear+ " and car model is " + x.carMake);

        }
        }
