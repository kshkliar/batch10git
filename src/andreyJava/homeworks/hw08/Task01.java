package andreyJava.homeworks.hw08;

/*В определенном предложении найти самое длинное и короткое слово.*/
public class Task01 {
    public static void main(String[] args) {


        String sentence = "What is the largest and smallest word";
        String word = " ";
        String small = " ";
        String large = " ";
        String[] words = new String[100];
        int length = 0;

        sentence = sentence + " ";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                word = word + sentence.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];

        for (int j = 0; j < length; j++) {

            if (small.length() > words[j].length())
                small = words[j];

            if (large.length() < words[j].length())
                large = words[j];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);

        String[] words1 = sentence.split(" ");
    }
}
