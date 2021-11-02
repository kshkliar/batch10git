package replit;
/*
Create a method in wich you will be printing numbers from 1 to 10
Call the method in the main method
Expected Output: 1 2 3 4 5 6 7 8 9 10
 */


public class Task112a {
    public static void main(String[] args) {

Task112a m=new Task112a();
m.numbers();


    }

    void numbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ " ");
        }
    }
}