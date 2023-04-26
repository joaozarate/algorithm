package io.joaozarate.algorithm.learning.sorting;

public class BubbleSort {

    static int[] execute(int[] array) {// 8, 5, 2, 9, 5, 6, 3

        if (array.length == 0) {
            return new int[]{};
        }

        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            counter += 1;
        }

        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int aux = array[j];
        array[j] = array[i];
        array[i] = aux;
    }

}
