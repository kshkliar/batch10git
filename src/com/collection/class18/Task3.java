package com.collection.class18;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and
    return a new String that consist only of vowels.
    Method should be available inside the class only where it was
    declared and executed by calling it is name.
     */// so it must be static  it will be called by name only
    private static String onlyVowels(String inputStr){
        return inputStr.replaceAll("[^aeiouAEIOU]","");// replace all other then not vovel( we used regex)
        //мы заменили все символы что не гласные на ничто
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("abcdefghiaeioU"));
    }
}
