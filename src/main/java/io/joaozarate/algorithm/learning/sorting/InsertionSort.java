package io.joaozarate.algorithm.learning.sorting;

public class InsertionSort {

    static int[] execute(int[] array) {

        if (array.length == 0) {
            return new int[] {};
        }

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(j, j - 1, array);
                j -= 1;
            }
        }

        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
