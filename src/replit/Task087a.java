package replit;

/***For you to do:**
 Create a class named 'Main' with specific attributes.
 Create two objects of that class in which you will be assigning the following
 values and then print them.
 carColor='Black'
 carYear=2019
 carMake='BMW'
 carColor='White'
 carYear=2018
 carMake='Toyota'
 **Expected Output:**
 ```
 Car color is Black and car year is 2019 and car model is BMW
 Car color is White and car year is 2018 and car model is Toyota
 ```*/
public class Task087a {

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {

        Task087a object_a = new Task087a();
        Task087a object_b = new Task087a();

        object_a.carColor = "Black";
        object_a.carMake = "BMW";
        object_a.carYear = 2019;

object_b.carColor="White";
object_b.carYear=2018;
object_b.carMake="Toyota";

        System.out.println("Car color is "+ object_a.carColor+" and car year is "
                        + object_a.carYear+ " and car model is "+object_a.carMake );

        System.out.println("Car color is "+ object_b.carColor+" and car year is "
                        + object_b.carYear+ " and car model is "+object_b.carMake );



    }
}
