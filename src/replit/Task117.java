package replit;

/* Create a method with the following specs:
Returns:
an integer
Name:
sumEvenTox
Parameters:
an integer called "x"
Purpose: calculate the sum of the EVEN integers from 1 to x (including x)
Exampels:
sumEvenTox(5)==>6
sumEvenTox(8)==>20
 */



public class Task117 {
    public static void main(String[] args) {
        System.out.println(sumEvenTox(5));
        System.out.println(sumEvenTox(8));
    }
        public static int sumEvenTox(int x){
            int sum=0;
            for (int i=1; i<=x;i++){
                if (i%2==0){
                    sum=sum+i;
                }
            }
            return sum;
        }
    }

