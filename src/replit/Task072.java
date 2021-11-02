package replit;
/*Write a program that creates an array with the following values{s, a, y, b, n, c, t, d, a, e, x}
Print the values so the output should look like below
**Output:**
syntax
 */
public class Task072 {
    public static void main(String[] args) {
        char []array ={'s', 'a','y','b','n','c', 't','d','a', 'e','x'};
        System.out.println(array[0]+""+array[2]+ ""+ array[4]+""+array[6]+""+array[1]+""+array[10]);


        System.out.println("-----Another way  for loop----------\n");

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
        System.out.println("-----Another way  if statement----------");
        for (int i = 0; i < array.length; i++) {
            if(i%2==0)
                System.out.print(array[i]);
        }
    }
}
