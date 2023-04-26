package io.joaozarate.algorithm.attempt.sorting;

public class AnagramBobbleSort {

    static boolean execute(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < char1.length - 1 - counter; i++) {
                if (char1[i] > char1[i + 1]) {
                    swap(i, i + 1, char1);
                    isSorted = false;
                }
                if (char2[i] > char2[i + 1]) {
                    swap(i, i + 1, char2);
                    isSorted = false;
                }
            }
            char lastChar1 = char1[char1.length - 1 - counter];
            char lastChar2 = char2[char2.length - 1 - counter];
            if (lastChar1 != lastChar2) {
                return false;
            }
            counter += 1;
        }

        return true;
    }

    private static void swap(int i, int j, char[] arrayChar) {
        char aux = arrayChar[j];
        arrayChar[j] = arrayChar[i];
        arrayChar[i] = aux;
    }

}
