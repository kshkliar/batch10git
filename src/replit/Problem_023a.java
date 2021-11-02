package replit;/*
Create a program that will ask a user to input boolean value "Input the boolean value"
If the input is true or false, then the output should look like below:
Example Output:
Input the boolean value
The value is true
Example Output:
Input the boolean value
The value is false
 */

import java.util.Scanner;

public class Problem_023a {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean boolValue = scan.nextBoolean();
if (boolValue==true){
    System.out.println("The value is true");
}else{
    System.out.println("The value is false");
}

    }
}
