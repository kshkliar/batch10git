package replit;

/*
Write a program to print the perimeter and area of a rectangle
 with width = 5 and height = 8.
**Output:**
The perimeter of a rectangle with width __ and height __ is equals to __
and the area equals to __
 */
public class Problem_011a {
    public static void main(String[] args) {

int rWidth=5;
int rHeigh=8;

int perimeter=(rWidth+rHeigh)*2;
int area= rWidth*rHeigh;
        System.out.println("The perimeter of rectangle with width "+ rWidth+ " and" +
                        " height " +rHeigh+ " is equals to "+perimeter+ " and the area equals " +
                        "to " +area);




    }
}
