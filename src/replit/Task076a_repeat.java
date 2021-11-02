package replit;

import java.util.Scanner;

/*Write a program that creates a String array with size 7.
Ask the user to input Days of week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
xample:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc
**Example Output:**
```
Please enter day 1 of the week
```
```
Sunday
 */
public class Task076a_repeat {
    public static void main(String[] args) {

        String[] array = new String[7];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length;i ++) {
            System.out.println("Please enter day" + (i + 1) + "of the week");
            array [i]= scan.next();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}