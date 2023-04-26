package io.joaozarate.algorithm.learning.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void Test() {
        Assertions.assertTrue(Anagram.execute("amor", "roma"));
        Assertions.assertTrue(Anagram.execute("mora", "ramo"));
        Assertions.assertTrue(Anagram.execute("asa", "saa"));
        Assertions.assertTrue(Anagram.execute("amigos", "imagos"));
        Assertions.assertTrue(Anagram.execute("batata", "tabata"));
        Assertions.assertTrue(Anagram.execute("alma", "lama"));
        Assertions.assertTrue(Anagram.execute("deus", "sude"));
    }

}