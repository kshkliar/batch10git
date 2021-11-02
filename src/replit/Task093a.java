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
public class Task093a {
    public static void main(String[] args) {
        String str = "abracadabra bro";
        String target1="ab";
        String target2="bra";
        String target3="bro";
        String target4="Lamb";

        System.out.println(str.indexOf('b'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target3));
        System.out.println(str.indexOf("abr"));
        System.out.println(str.indexOf(target4));
    }


}
