package replit;
/*
How would you reverse a String using StringBuffer Class
Given String ="Hello Friends"
Expected Output:
sdneirF olleH
 */



public class Task107a {
    public static void main(String[] args) {
        String text = "Hello friend";
        StringBuilder stringBuilder=new StringBuilder(text);
        System.out.println(stringBuilder.reverse());
    }
}
