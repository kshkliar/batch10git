package replit.Repl168;
/*For you to do:
Create an instance final method that will reverse a String
and return that new String
Call method from the main method
**Expected Output:**
olleh*/
class Main {
     String myString="hello";

    public final String reverseMyString(){
        return new StringBuilder(myString).reverse().toString();
    }

    public static void main(String[] args){
        Main main=new Main();
        System.out.println(main.reverseMyString());
    }
}
