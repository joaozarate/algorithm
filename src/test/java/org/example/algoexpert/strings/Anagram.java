package org.example.algoexpert.strings;

public class Anagram {

    static boolean execute(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        int countChar1 = 0;
        int countChar2 = 0;

        for (int i = 0; i < char1.length; i++) {
            countChar1 += char1[i];
            countChar2 += char2[i];
        }

        return countChar1 == countChar2;
    }

}
