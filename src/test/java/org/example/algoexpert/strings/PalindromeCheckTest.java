package org.example.algoexpert.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

    @Test//atorredaderrota
    void TestCase1() {
        Assertions.assertTrue(PalindromeCheck.execute(" A torre da derrota"));
    }

}