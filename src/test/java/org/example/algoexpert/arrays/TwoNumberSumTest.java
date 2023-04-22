package org.example.algoexpert.arrays;

import org.example.algoexpert.arrays.TwoNumberSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoNumberSumTest {

    @Test
    void twoNumberSum() {
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assertions.assertTrue(output.length == 2);
        Assertions.assertTrue(contains(output, -1));
        Assertions.assertTrue(contains(output, 11));
    }

    private boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}