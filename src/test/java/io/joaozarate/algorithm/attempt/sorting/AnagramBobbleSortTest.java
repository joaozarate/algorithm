package io.joaozarate.algorithm.attempt.sorting;

import io.joaozarate.algorithm.attempt.sorting.AnagramBobbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramBobbleSortTest {

    @Test
    void Test() {
        Assertions.assertTrue(AnagramBobbleSort.execute("amor", "roma"));
        Assertions.assertTrue(AnagramBobbleSort.execute("mora", "ramo"));
        Assertions.assertTrue(AnagramBobbleSort.execute("asa", "saa"));
        Assertions.assertTrue(AnagramBobbleSort.execute("amigos", "imagos"));
        Assertions.assertTrue(AnagramBobbleSort.execute("batata", "tabata"));
        Assertions.assertTrue(AnagramBobbleSort.execute("alma", "lama"));
        Assertions.assertTrue(AnagramBobbleSort.execute("deus", "sude"));
    }

}