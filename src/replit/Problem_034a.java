package replit;
/*Write a program to find the largest number among three distinct numbers
using nested if condition
Please use Scanner class to take input from users
**Expected Output:**
```
Please enter 3 distinct numbers 4 5  and 14
``
```
The largest number is 14*/
import java.util.Scanner;

public class Problem_034a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Please enter 3 distinct numbers 4 5 and 14");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("The largest is " + num1);
            }else{
        }
            System.out.println("The largest is  "+num3);


        } else{
            if (num2 > num3) {
                System.out.println("The largest is "+num2);
            }else{
                System.out.println("The largest number  "+num3);
            }
            }
        }
}