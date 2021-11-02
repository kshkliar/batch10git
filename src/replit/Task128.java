package replit;
/*
Create a static method with the following specification
Return Type: String
Method name: mixString
Parameters:
a String called s1
a String called s2
Then inside method write logic that will return the string combined, one letter at a time , starting with s1
See example blow for example:
NOTE: s1 and s2 should be an equal lengths:
 s1==> "12345"

 */
public class Task128 {
    //test case below (dont change):

    static  String mixString(String s1, String s2){
        String returnedString="";
        for (int i=0;i<s1.length();i++){
            returnedString= returnedString+ s1.charAt(i)+ s2.charAt(i);
        }
        return returnedString;
    }

    public static void main(String[] args) {
        String firstValue=mixString("12345","abcde");
        System.out.println(firstValue);
    }
}
