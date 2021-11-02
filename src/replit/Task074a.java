package replit;
/*Write a program that creates an array of integers of size 11.
 Add the years 2010 to 2020 to your array one by one using a for
  loop and then print all those values.

**Example:**
```
2010
```
```
2011
```
```
2012
```
```
2013
 */


public class Task074a {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length;i++) {
            System.out.println(2010+i);

        }
        System.out.println();

        System.out.println(array[1]);
        System.out.println(array[2]);

        }
    }

