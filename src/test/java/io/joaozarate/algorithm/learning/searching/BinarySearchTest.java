package io.joaozarate.algorithm.learning.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void Test() {
        int position = BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33);
        Assertions.assertEquals(3, position);
    }

}