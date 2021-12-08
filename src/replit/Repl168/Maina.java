package replit.Repl168;
/*For you to do:
Create an instance final method that will reverse a String
and return that new String
Call method from the main method
**Expected Output:**
olleh*/
class Maina {
    String myString = "Hello";

    public final String reverseMyString() {
        return new StringBuilder(myString).reverse().toString();
    }

    public static void main(String[] args) {
        Maina m1=new Maina();
        System.out.println(m1.reverseMyString());
    }
}
