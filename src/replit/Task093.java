package replit;
/* Print out the position of the first occurrence of "c".
Print out the position of the first occurrence of " ".
Print out the position of the first occurrence of the variable target1.
Print out the position of the first occurrence of the variable target2.
Expcted Output:
4
11
6
-1
 */
public class Task093 {
    public static void main(String[] args) {
        String str = "abracadabra alacazam";
        String target1="dab";
        String target2= "ab";
        String target3="ZAM";

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));
        System.out.println(str.indexOf(target3));
    }


}
