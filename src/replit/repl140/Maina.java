package replit.repl140;

/*For you to do . Write a method , that will find which String
is the Longest and print it*/
class Maina {

    static String maxLength(String[] myArr) {
        String maxString=" ";
        for (String s : myArr) {
            if (s.length() > maxString.length()) {
                maxString=s;
            }
        }
        return maxString;
    }

}

class MainaTester {
    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(Maina.maxLength(arr));
        //should print "this is long"
    }
}