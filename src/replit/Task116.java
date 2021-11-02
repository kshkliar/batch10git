package replit;

public class Task116 {


    public static void main(String[] args) {

        System.out.println((numbers(4,4)));// main method
    }


    public static boolean numbers( int a, int b){// accept two numbers
        if (a%2==0 && b%2==0) {// condition
            return true;
        }else{
            return false;// return
        }
    }
}
