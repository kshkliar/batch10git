package replit.repl140;

class Main {

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

    static String maxLength(String[] myArr) {
        String maxString = "";
        for (String s : myArr) {
            if (s.length() > maxString.length()) {
                maxString = s;
            }
        }
        return maxString;
    }
}

