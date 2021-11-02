package replit;
/*
Declare 3 instance variable to hold:
year, school name and batch#
Access variables from the main method and assign specific value to them
Print values of variables in the following format:
Expected Output:
I am a student of batch 6 studing at Syntax in the year of 2020
 */
public class Task120 {
    static int year;
    static String schoolName;
    static int batch;

    public static void main(String[]args){
        year=2020;// получаем доступ сразу так как переменные статические
        schoolName="Syntax";
        batch=6;

        System.out.println("I am a student of batch " + batch + " studing at " +schoolName + " in the year of " + year);
    }
}
