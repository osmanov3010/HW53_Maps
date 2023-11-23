package ait.map.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ait.map.word.Anagram.*;

class DigitsFreqApplTest {

    final String word = "electricity";

    @Test
    void testIsAnagram() {
        assertTrue(isAnagram(word, "city"));
        assertTrue(isAnagram(word, "tic"));
        assertTrue(isAnagram(word, "City"));
        assertTrue(isAnagram(word, "rele"));
        assertTrue(isAnagram(word, "tric"));
    }
    @Test
    void testIsNotAnagram() {
        assertFalse(isAnagram(word, "tell"));
        assertFalse(isAnagram(word, "select"));
        assertFalse(isAnagram(word, "write"));
        assertFalse(isAnagram(word, "collect"));
        assertFalse(isAnagram(word, ""));
        assertFalse(isAnagram(word, null));
    }
}