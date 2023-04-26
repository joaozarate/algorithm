package io.joaozarate.algorithm.learning.strings;

public class PalindromeCheck {

    static boolean execute(String str) {

        String string = str.toLowerCase().replace(" ", "");

        int leftIdx = 0;
        int rightIdx = string.length() - 1;

        while (leftIdx < rightIdx) {
            if (string.charAt(leftIdx) != string.charAt(rightIdx)) {
                return false;
            }
            leftIdx += 1;
            rightIdx -= 1;
        }

        return true;
    }

}
