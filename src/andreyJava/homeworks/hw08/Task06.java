package andreyJava.homeworks.hw08;

/*Implement method hasNoneLetters. Method returns true if none of the letters in
the blacklist are present in the phrase.
   If at least one letter from blacklist is present in the phrase return false.
    Comparison should be case insensitive. Meaning 'A' == 'a'.*/
public class Task06 {

    public static boolean hasNoneLetters(String str, String blackList) {

        str = str.toLowerCase();
        blackList = blackList.toLowerCase();

        boolean isExist = false;

        for (int i = 0; i < str.length(); i++) {

            char symbol = str.charAt(i);

            if (blackList.contains(String.valueOf(symbol))) {
                isExist = true;
                break;
            }

        }

        return isExist;

    }

    public static void main(String[] args) {
        String str = "Hello";
        String blackList = "lo";

       boolean result= hasNoneLetters(str, blackList);
        System.out.println(result);
    }
}
